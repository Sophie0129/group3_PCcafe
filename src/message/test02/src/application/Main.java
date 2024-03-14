package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      ServerSocket serverSocket = null;
      Socket socket = null;
      BufferedReader in = null;
      BufferedWriter out = null;
      Scanner sc = new Scanner(System.in);
      
      try {
         //서버 소켓 생성
         serverSocket = new ServerSocket(10000);
         //연결 대기
         System.out.println("연결 대기중..");
         
         socket = serverSocket.accept();
         System.out.println("연결 되었습니다.");
         
         //네트워크 입출력 스트림 생성
         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
         while(true) {
            String inMsg = in.readLine();
            if(inMsg.equalsIgnoreCase("bye")){
               System.out.println("손님이 나갔습니다.");
               break;
            }
            System.out.println("손님 : "+inMsg);
            
            System.out.println("보내기 : ");
            String outMsg = sc.nextLine();
            out.write(outMsg + "\n");
            out.flush();
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      finally {
         try {
            sc.close();
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}