package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Pc_Controller implements Initializable{
	@FXML public TextArea fxre;
	@FXML public TextField  fxwr1;
	@FXML public TextField  fxwr2;
	@FXML public Button btnsend;
	@FXML public Button btnsend1;
	@FXML public Button btnclose;
	Scanner sc = new Scanner(System.in);
	Parent root;
	Pc_Service ps;
	public void setRoot(Parent root) {
		this.root = root;
	}

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	ps = new Pc_ServiceImpl();
}
public void sendFunc() {
	//ps.sendFunc(fxwr1);
//System.out.println("보내기 버튼 클릭");
	ps.socket();
	ps.sendFunc(fxwr1);
	
	/*fxwr1.setOnKeyPressed((EventHandler<? super KeyEvent>) new EventHandler<KeyEvent> () {
	    @Override
	      public void handle(KeyEvent event) {
	            //실행할 코드.
	            sendFunc();
	      }
	});
	
	
String text = fxwr1.getText();
fxre.appendText(text );
fxwr1.clear();}
/*String strInput = fxwr1.getText();
fxre.setText(strInput);*/
}

public void sendFunc1() {
	ps.socket1();
	ps.sendFunc1(fxwr2);
	/*fxwr2.setOnKeyPressed((EventHandler<? super KeyEvent>) new EventHandler<KeyEvent> () {
	    @Override
	      public void handle(KeyEvent event) {
	            //실행할 코드.
	            sendFunc1();
	      }
	});
	String text = fxwr2.getText();
    fxre.appendText(text);
    fxwr2.clear();
	//ps.sendFunc1(fxwr2);
	System.out.println("회원 입력");
	/*String strInput = fxwr2.getText();
	fxre.setText(strInput);*/
}
public void closeFunc() {
	System.out.println("취소버튼 클릭");
	System.out.println("root"+root);
	ps.closeFunc(root);
}
}
