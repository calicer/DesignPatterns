package Adapter;

public class Main {

    public static void main(String[] args) {

        AssignmentWork aw = new AssignmentWork();

        PenAdaptor pa = new PenAdaptor();
        aw.setP(pa);


        aw.writeAssignment("writing.......");
    }

}
