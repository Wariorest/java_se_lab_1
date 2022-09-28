package src.classes;

import src.classes.exception.FieldLengthException;
import src.classes.exception.IncorrectSalaryException;

public class Employee{
    private int id;
    private int next_id;
    private String first_name;
    private String last_name;
    private double sal;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNext_id(int id) {
        this.next_id = next_id + 1;
    }

    public int getNext_id() {
        return next_id;
    }

    public void setFirst_name(String first_name) throws FieldLengthException {
        if(first_name.length() < 3){
            throw new FieldLengthException("First name length less then 3 symbols");
        } else if (first_name.length() > 16) {
            throw new FieldLengthException("First name length more then 16 symbols");
        }else{
            this.first_name = first_name;
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) throws FieldLengthException{
        if(last_name.length() < 3){
            throw new FieldLengthException("Last name length less then 3 symbols");
        } else if (last_name.length() > 16) {
            throw new FieldLengthException("Last name length more then 16 symbols");
        }else{
            this.last_name = last_name;
        }
    }

    public String getLast_name() {
        return last_name;
    }

    public void setSal(double sal) throws IncorrectSalaryException {
        if(sal < 0){
            throw new IncorrectSalaryException(sal);
        }else{
            this.sal = sal;
        }

    }

    public double getSal() {
        return sal;
    }

    public Employee(int id,String first_name, String last_name,double sal) throws FieldLengthException, IncorrectSalaryException {
        setId(id);
        setNext_id(id);
        setFirst_name(first_name);
        setLast_name(last_name);
        setSal(sal);
    }

}