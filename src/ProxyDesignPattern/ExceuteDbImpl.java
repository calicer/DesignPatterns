package ProxyDesignPattern;

public class ExceuteDbImpl implements ExecuteDB{
    @Override
    public void execute(String query) {
        System.out.println("Deleting");
    }
}
