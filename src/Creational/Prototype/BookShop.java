package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String name;
    private List<Book> books = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){

       // List<Book> li = new ArrayList<>();
        for (int i = 0; i<5; i++){
            Book b = new Book();
            b.setName("BID" + i);
            b.setId(i);
            getBooks().add(b);
           // li.add(b);
        }
      //  return li;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        BookShop bs = new BookShop();

        for (Book b : this.getBooks()){
            bs.getBooks().add(b);
        }
        return bs;
    }
}
