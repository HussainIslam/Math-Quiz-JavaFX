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
        quizPane.add(textAddition, 1, 1);

        Label labelSubtraction = new Label("What is subtraction of ");
        TextField textSubtraction = new TextField();
        quizPane.add(labelSubtraction, 0, 2);
        quizPane.add(textSubtraction, 1, 2);

        Label labelMultiplication = new Label("What is multiplication of ");
        TextField textMultiplication = new TextField();
        quizPane.add(labelMultiplication, 0, 3);
        quizPane.add(textMultiplication, 1, 3);

        Label labelDivision = new Label("What is division of ");
        TextField textDivision = new TextField();
        quizPane.add(labelDivision, 0, 4);
        quizPane.add(textDivision, 1, 4);

        Label labelCorrect = new Label("Number of correct answers: ");
        Label labelWrong = new Label("Number of wrong answers: ");
        quizPane.add(labelCorrect, 0, 5);
        quizPane.add(labelWrong, 0, 6);
        GridPane.setColumnSpan(labelCorrect, 2);
        GridPane.setColumnSpan(labelWrong, 2);


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(mainPane, 350, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
