package src.classes.exception;

public class IncorrectSalaryException extends Exception {
    public IncorrectSalaryException(){
        super("Incorrect salary value.");
    }
    public IncorrectSalaryException(double sal){
        super("Salary less then 0, current salary: " + sal);
    }
}
