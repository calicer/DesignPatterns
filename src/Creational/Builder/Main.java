package Creational.Builder;

public class Main {

    public static void main(String[] args) {

        PhoneBuilder pb = new PhoneBuilder();

        Phone p = pb.setOS("IOS").getPhone();

        System.out.println(p);

    }
}
