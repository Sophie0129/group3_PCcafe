package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import application.Pc_Controller;
import application.URLService;

public class Server extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		/*System.out.println("Pc.fxml");
		System.out.println("file:/"+Paths.get("").toAbsolutePath().toString());
		System.out.println("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/application/Pcroom.fxml");
			URL url = new URL(URLService.fxPath + "application/Pcroom.fxml"); 
			System.out.println(URLService.fxPath+ "application/Pcroom.fxml");
			FXMLLoader loader = new FXMLLoader( url  );
		    Parent root = loader.load();
		    
		    
		    
		    Pc_Controller ctrl = loader.getController();
		    ctrl.setRoot(root);
		    
		    Scene scene = new Scene(root);
		    arg0.setScene(scene);
		    arg0.show();  }	*/	
		
		/*ServerSocket serverSocket = null;
	    Socket socket = null;
	    BufferedReader in = null;
	    BufferedWriter out = null;
	    Scanner sc = new Scanner(System.in);
	    Pc_Controller pco = new Pc_Controller();  
	      try {
	    	  
	         //서버 소켓 생성
	         serverSocket = new ServerSocket(1000);
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
	            
	            String strInput = pco.fxwr1.getText();
	            pco.fxwr1.setText(strInput);
	            
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
	
	   public static void main(String[] args) {
	     /* ServerSocket serverSocket = null;
	      Socket socket = null;
	      BufferedReader in = null;
	      BufferedWriter out = null;
	      Scanner sc = new Scanner(System.in);
	      
	      try {
	    	  
	         //서버 소켓 생성
	         serverSocket = new ServerSocket(1000);
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
	   }*/
	   }
}