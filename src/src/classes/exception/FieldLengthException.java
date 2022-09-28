package src.classes.exception;

public class FieldLengthException extends Exception{
    public FieldLengthException(){
        super("incorrect String format.");
    }
    public FieldLengthException(String msg){
        super(msg);
    }
}
