package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class SubmitEventHandler implements EventHandler<KeyEvent> {
    private final String addition;
    private final String subtraction;
    private final String multiplication;
    private final String division;
    private final int number1;
    private final int number2;
    private final Label correctLabel;
    private final Label wrongLabel;


    SubmitEventHandler(
            String addition, String subtraction, String multiplication, String division, int num1, int num2,
            Label correct, Label wrong){
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
        this.number1 = num1;
        this.number2 = num2;
        this.correctLabel = correct;
        this.wrongLabel = wrong;
    }

    @Override
    public void handle(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER)){
            try{
                if( addition.equals("") ||
                    subtraction.equals("") ||
                    multiplication.equals("") ||
                    division.equals("")){
                    throw new Exception();
                }
                int inputAddtion = Integer.parseInt(addition);
                int inputSubtraction = Integer.parseInt(subtraction);
                int inputMultiplication = Integer.parseInt(multiplication);
                double inputDivision = Double.parseDouble(division);

                int correctCounter = 0;
                int wrongCounter = 0;

                if (inputAddtion == (number1 + number2)) {
                    correctCounter++;
                } else {
                    wrongCounter++;
                }

                if(inputSubtraction == (number1 - number2)){
                    correctCounter++;
                } else {
                    wrongCounter++;
                }

                if(inputMultiplication == (number1 * number2)){
                    correctCounter++;
                } else{
                    wrongCounter++;
                }

                if(inputDivision == (number1 / number2)){
                    correctCounter++;
                } else {
                    wrongCounter++;
                }



            }
            catch (Exception ex){
                System.out.println(ex.toString());
            }
        }
    }

}
