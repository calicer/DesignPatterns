package Creational.AbstractFac;

public class CarFactory {

    public static Car Create(String str){
        if (str.equals("Tata")){
            return new Tata();
        } else if (str.equals("Volkswagon")){
            return new Volkswagon();
        }
        return null;
    }
}
