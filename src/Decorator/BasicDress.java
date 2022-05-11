package Decorator;

public class BasicDress implements Dress{
    @Override
    public void assemble() {
        System.out.println("Basic Dress Features");
    }
}

interface Dress(){
    public void assemble();
}

class DressDecorator implements Dress{


    protected Dress dress;

    public DressDecorator(Dress dress){
        this.dress = dress;
    }

    @Override
    public void assemble() {
        this.dress.assemble();
    }
}
class CasualDress extends DressDecorator{

    public CasualDress(Dress c){
        super(c);
    }
    @Override
    public void assemble() {
        System.out.println("Casual Dress Features");
    }
}

class FancyDress extends DressDecorator{

    public FancyDress(Dress c){
        super(c);
    }
    @Override
    public void assemble() {
        System.out.println("Fancy Dress Features");
    }
}

//FancyDress fd = new FancyDress(new BasicDress());