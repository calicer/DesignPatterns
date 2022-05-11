package ProxyDesignPattern;

public class DBProxy implements ExecuteDB{

    boolean ifAdmin;
    private ExceuteDbImpl exceuteDb;

    public DBProxy(String name, String password){
        if (name == "Admin" && password == "Pass"){
            ifAdmin = true;
            exceuteDb = new ExceuteDbImpl();
        }
    }

    @Override
    public void execute(String query) throws Exception {
        if(ifAdmin){
            exceuteDb.execute(query);
        } else{
            if(query.equals("DELETE")){
                throw new Exception("NOT AUTH");
            } else{
                exceuteDb.execute(query);
            }
        }
    }
}
