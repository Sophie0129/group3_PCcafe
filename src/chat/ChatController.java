package chat;

import java.awt.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class ChatController implements Initializable{
	@FXML public TextArea ClientView;
	@FXML public TextField ClientInput;
	
	// SBFunc > 손님 메세지 보내기 버튼
	
	Parent root;
	C_ServiceImpl csi;
	public void setRoot(Parent root) {
		csi = new C_ServiceImpl();
		this.root = root;
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		csi = new C_ServiceImpl();
		System.out.println("손님 채팅 초기화");
		
	}
	public void SBFunc() {
		System.out.println("손님 채팅 보내기 버튼");
		csi.SBFunc();
	}

}
