package Creational.AbstractFac;

public class Main {

    public static void main(String[] args) {
        GetFactory g = new GetFactory();

        Car c  = g.getCarFactory("Tata");
        c.run();
        Color co = g.getColorFactory("Red");
        co.doColor();
    }
}
