package Creational.AbstractFac;

public class GetFactory extends AbstractFactory {


    @Override
    public Color getColorFactory(String type) {
       return ColorFactory.getColor(type);
    }

    @Override
    public Car getCarFactory(String type) {
        return CarFactory.Create(type);
    }
}
