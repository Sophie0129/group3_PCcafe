package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Pc_ServiceImpl implements Pc_Service {
	Server server = new Server();
	Scanner sc = new Scanner(System.in);
	Pc_Controller con;
	private TextInputControl fxre;
	private TextInputControl fxwr2;

 public void closeFunc(Parent root) {
	 Stage stage = (Stage)root.getScene().getWindow();
	 stage.close();
 }
 public void socket1() {
	 ServerSocket serverSocket = null;
	    Socket socket = null;
	    BufferedReader in = null;
	    BufferedWriter out = null;
	    Scanner sc = new Scanner(System.in);
	    
	    String strInput = fxwr2.getText();
	   con.fxre.setText(strInput);
	      try {
	    	  
	         //서버 소켓 생성
	        serverSocket = new ServerSocket(1000);
	        socket = serverSocket.accept();
	         //네트워크 입출력 스트림 생성
	         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	        while(true) {
	        	 String outMsg = sc.nextLine();
	            out.write(outMsg + "\n");
	            out.flush();
	            String inMsg = in.readLine();
	            System.out.println("손님 : "+inMsg);
	            if(inMsg.equalsIgnoreCase("bye")){
	        	 String text = fxwr2.getText();
	            con.fxre.appendText(text);
	             fxwr2.clear();
	            //   System.out.println("손님이 나갔습니다.");
	              break;
	            }
	            
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

public void socket() {
	/*ServerSocket serverSocket = null;
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
@Override
public void sendFunc(TextField fxwr1) {
	
	fxwr1.setOnKeyPressed((EventHandler<? super KeyEvent>) new EventHandler<KeyEvent> () {
	    @Override
	      public void handle(KeyEvent event) {
	            //실행할 코드.
	            sendFunc(fxwr1);
	      }
	});
	
	
String text = fxwr1.getText();
fxre.appendText(text );
fxwr1.clear();
	
	/*ServerSocket serverSocket = null;
    Socket socket = null;
    BufferedReader in = null;
    BufferedWriter out = null;
    Scanner sc = new Scanner(System.in);
    
    String strInput = fxwr1.getText();
   con.fxre.setText(strInput);
      try {
    	  
         //서버 소켓 생성
        serverSocket = new ServerSocket(1000);
 
         //네트워크 입출력 스트림 생성
         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while(true) {
        	 String outMsg = sc.nextLine();
            out.write(outMsg + "\n");
            out.flush();
            String inMsg = in.readLine();
            System.out.println("손님 : "+inMsg);
            if(inMsg.equalsIgnoreCase("bye")){
        	 String text = fxwr1.getText();
            con.fxre.appendText(text);
             fxwr1.clear();
            //   System.out.println("손님이 나갔습니다.");
              break;
            }
            
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

public void sendFunc1(TextField fxwr2) {
	
	fxwr2.setOnKeyPressed((EventHandler<? super KeyEvent>) new EventHandler<KeyEvent> () {
	    @Override
	      public void handle(KeyEvent event) {
	            //실행할 코드.
	            sendFunc1(fxwr2);
	      }
	});
	String text = fxwr2.getText();
    fxre.appendText(text);
    fxwr2.clear();
	//ps.sendFunc1(fxwr2);
	//System.out.println("회원 입력");
	/*String strInput = fxwr2.getText();
	fxre.setText(strInput);*/
	/*ServerSocket serverSocket = null;
    Socket socket = null;
    BufferedReader in = null;
    BufferedWriter out = null;
    Scanner sc = new Scanner(System.in);
    
    String strInput = fxwr2.getText();
   con.fxre.setText(strInput);
      try {
    	  
         //서버 소켓 생성
         serverSocket = new ServerSocket(1000);
 
         //네트워크 입출력 스트림 생성
         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
         while(true) {
        	 String outMsg = sc.nextLine();
             out.write(outMsg + "\n");
             out.flush();
            String inMsg = in.readLine();
            
            System.out.println("관리자: "+inMsg);
           // if(inMsg.equalsIgnoreCase("bye")){
            //   System.out.println("손님이 나갔습니다.");
           //    break;
            //}
            
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
