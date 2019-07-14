package sample;

public class EmptyInputException extends Exception {
    EmptyInputException(){}
    EmptyInputException(String message){
        super(message);
    }
}
