public class Cyndaquil extends Pokemon implements Runable{
    public Cyndaquil(){
        super("Cyndaquil", 15, 100, 100);
    }

    public void move(){
        this.run();
    }

    public void run(){
        this.reducedWeight(2);
    }
    
}