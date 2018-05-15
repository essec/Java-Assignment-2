public class Totodile extends Pokemon implements Runable{
    public Totodile(){
        super("Totodile", 40, 100, 100);
    }

    public void move(){
        this.run();
    }

    public void run(){
        this.reducedWeight(2);
    }
    
}