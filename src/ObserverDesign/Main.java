package ObserverDesign;

public class Main {

    public static void main(String[] args) {

        Channel c = new Channel("Subscribed new video");

        Subscriber s = new Subscriber("Vishal");
        Subscriber s1 = new Subscriber("Aman");
        Subscriber s2 = new Subscriber("Raman");
        Subscriber s3 = new Subscriber("avish");
        Subscriber s4 = new Subscriber("google");

        c.subscribe(s);
        c.subscribe(s1);
        c.subscribe(s2);
        c.subscribe(s3);
        c.subscribe(s4);

        s.subsChannel(c);
        s1.subsChannel(c);
        s2.subsChannel(c);
        s3.subsChannel(c);
        s4.subsChannel(c);

        c.notifyTo();



    }
}
