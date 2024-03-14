package application;
	
import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import application.Pc_Controller;
import application.URLService;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		Parent root = (Parent)FXMLLoader.load(getClass().getResource("pcroom.fxml"));
		//PrimaryStage.setScene(scne);
		
		
		
	System.out.println("Pc.fxml");
	System.out.println("file:/"+Paths.get("").toAbsolutePath().toString());
	System.out.println("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/application/pcroom.fxml");
		URL url = new URL(URLService.fxPath + "/application/pcroom.fxml");
		System.out.println(URLService.fxPath + "application/pcroom.fxml");
		FXMLLoader loader = new FXMLLoader( url  );
	    root = loader.load();
	    
	    
	    Pc_Controller ctrl = loader.getController();
	    ctrl.setRoot(root);
	    
	    Scene scene = new Scene(root);
	    arg0.setScene(scene);
	    arg0.show();   
	}

	public static void main(String[] args) {
		launch(args);
	
}
}