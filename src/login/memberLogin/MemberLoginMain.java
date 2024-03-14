package login.memberLogin;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginController;
import login.LoginURL;

public class MemberLoginMain{
	/*
	public void MemberLogin() {
		//System.out.println(getClass().getResource(""));
		//  file:/D:/0_김보선_핀테크/Java/workspace-java/group3_PCcafe/bin/login/memberLogin/
		//System.out.println(Paths.get("").toAbsolutePath().toString());
		//  D:\0_김보선_핀테크\Java\workspace-java\group3_PCcafe
		
		
		Stage st = new Stage();
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/MemberLogin.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			Parent root = loader.load();
			Scene sc = new Scene(root);
			st.setScene(sc);
			st.show();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	*/
	
	public void MemberLogin(Parent root,String mi, String mn, String tt) {
		Stage st = (Stage)root.getScene().getWindow();
		try {
		URL url = new URL(LoginURL.fxpath+"login/loginFX/MemberLogin.fxml");
		FXMLLoader loader = new FXMLLoader(url);
		root = loader.load();
		
		MemberController cnt = loader.getController();
		cnt.setRoot(root);
		
		cnt.MemName.setText(mn);
		cnt.MemTime.setText(tt);
		ML_DTO dto = new ML_DTO();
		dto.setMemID(mi);
		dto.setMemtime(tt);
		
		int i = 0;
		i+=1;
		String itext = i + "";
		cnt.MemNumber.setText(itext);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		Scene sc = new Scene(root);
		st.setScene(sc);
		st.show();
		
	}
}
	
