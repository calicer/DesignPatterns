package ProxyDesignPattern;

public class Main {

    public static void main(String[] args) throws Exception {
        DBProxy db = new DBProxy("Admin","Pass");
        db.execute("DELETE");
    }
}
