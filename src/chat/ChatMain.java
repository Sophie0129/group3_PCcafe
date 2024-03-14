package chat;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginController;
import login.LoginURL;

public class ChatMain extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		URL loginurl = new URL(LoginURL.fxpath+"chat/chatFX/Client.fxml");
		FXMLLoader loader = new FXMLLoader(loginurl);
		Parent root = loader.load();

		ChatController setR = loader.getController();
		setR.setRoot(root);
		
		
		Scene sc = new Scene(root);
		arg0.setScene(sc);
		arg0.show();
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
