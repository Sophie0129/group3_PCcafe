package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

public static void main(String[] args) {
   
   Socket socket =null;
   BufferedReader in = null;
   BufferedWriter out = null;
   Scanner sc = new Scanner(System.in);
   
   try {
      Socket clientSocket = new Socket("localhost",10000);// 클라이언트 소켓 생성 및 서버 접속
      
      in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
      // 네트워크 입출력 스트립 생성
      while(true) {
         System.out.println("보내기 : ");
         String outMsg = sc.nextLine();
         if(outMsg.equalsIgnoreCase("bye")) {
            out .write(outMsg+"\n");
            out.flush();
            break;
            //서버로 데이터 전송
         }
         else{
            out.write(outMsg + "\n");
            out.flush();
            
            String inMsg = in.readLine();
            System.out.println("관리자 : " + inMsg);
         }
         
      }
   } catch (Exception e) {
         e.printStackTrace();
   
   }
   finally {
      try {sc.close();
      out.close();
      in.close();
      socket.close();
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
}