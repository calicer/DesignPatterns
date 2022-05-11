package Creational.AbstractFac;

public class ColorFactory {

    public static Color getColor(String type){
        if (type.equals("Black")){
            return new Black();
        } else if (type.equals("Red")){
            return new RedColor();
        }
        return null;
    }
}
