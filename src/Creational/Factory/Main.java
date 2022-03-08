package Creational.Factory;

public class Main {

    public static void main(String[] args) {
        Factory f = new Factory();
        Car c = f.Create("Tata");
        c.run();
    }
}
