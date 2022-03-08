package Creational.Singleton;

public class Student {

    private String name;
    private int rollNo;

    private static Student ins = new Student();

    private Student(){

    }

    public static Student getIns(){
        if (ins!= null){
            return ins;
        }
        return new Student();
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
