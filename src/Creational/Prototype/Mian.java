package Creational.Prototype;

public class Mian {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bs = new BookShop();

        bs.setName("Novelity");
        bs.loadData();



        BookShop bs1 = (BookShop) bs.clone();
        bs.setBooks(null);
        System.out.println(bs);
        System.out.println(bs1);




    }
}
