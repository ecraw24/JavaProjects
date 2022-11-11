import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class MyJavaFX extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btOK = new Button("OK");
		
		StackPane pane = new StackPane();
		pane.getChildren().add(btOK);
		
		Scene scene = new Scene(pane, 200, 250);
		
		primaryStage.setTitle("MyJavaFX Stage");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
