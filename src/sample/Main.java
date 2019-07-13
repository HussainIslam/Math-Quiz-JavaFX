package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane mainPane = new BorderPane();

        GridPane quizPane = new GridPane();
        mainPane.setCenter(quizPane);

        Label heading = new Label("Two randomly generated numbers are: ");
        quizPane.add(heading, 0, 0);
        GridPane.setColumnSpan(heading, 2);

        Label labelAddition = new Label("What is the addition of ");
        TextField textAddition = new TextField();
        quizPane.add(labelAddition, 0, 1);


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(mainPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
