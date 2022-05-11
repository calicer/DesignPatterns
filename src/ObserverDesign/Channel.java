package ObserverDesign;

import java.util.ArrayList;
import java.util.List;


//subject
public class Channel {

    private String name;
    private String desc;
    private List<Subscriber> sub = new ArrayList<>();


    public Channel(String name){
        this.name = name;
    }
    public void subscribe(Subscriber sub){
        this.sub.add(sub);
    }

    public void unsub(Subscriber sub){
        this.sub.remove(sub);
    }

    public void notifyTo(){
        for(Subscriber su: sub){
            su.notify(name);
        }
    }

}
