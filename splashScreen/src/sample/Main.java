package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	Stage stage;

	@FXML
	Label logoLabel;

	@Override
	public void start(Stage myStage) throws Exception {

		stage = myStage;

		MainWindow();

	}

	private void MainWindow() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource(
					"sample.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);

			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Dokdo");

			Font.loadFont(
					getClass().getResourceAsStream(
							"assets/Sacramento-Regular.ttf"), 20);

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeStage() {
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
