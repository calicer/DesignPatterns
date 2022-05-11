package Creational.AbstractFac;

public abstract class AbstractFactory {

    public abstract Color getColorFactory(String type);
    public abstract Car getCarFactory(String type);
}
