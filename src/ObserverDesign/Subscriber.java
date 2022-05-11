package ObserverDesign;


//observers
public class Subscriber {

    private String name;
    private Channel channel;

    public Subscriber(String name)
    {
        this.name = name;
    }
    public void notify(String title){
        System.out.println(title);
    }

    public void subsChannel(Channel ch){
        channel = ch;
    }
}
