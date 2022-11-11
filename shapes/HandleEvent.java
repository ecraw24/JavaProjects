import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class HandleEvent extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(new Color(1, 0, 0, 1));
		circle.setFill(new Color(0.5, 0.2, 1, 1));
		
		// Two buttons that go in an HBox pane.
		Button btOK = new Button("OK");
		btOK.setOnAction(e -> {
			System.out.println("My OK button was clicked!");	
			double r = Math.random();
			double g = Math.random();
			double b = Math.random();
			circle.setFill(new Color(r, g, b, 1.0));
		});
		
		Button btCancel = new Button("Cancel");
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(btOK, btCancel);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circle);
		borderPane.setBottom(pane);
		
		Scene scene = new Scene(borderPane, 500, 500);
		
		primaryStage.setTitle("HandleEvent");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	class OKHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("My OK button was clicked!");
			
		}
	}
	
	class CancelHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("My Cancel button was clicked!");
			
		}
	}
}


