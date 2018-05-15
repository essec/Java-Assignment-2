public class Chikorita extends Pokemon implements Runable{
    public Chikorita(){
        super("Chikorita", 25, 100, 100);
    }

    public void move(){
        this.run();
    }

    public void run(){
        this.reducedWeight(2);
    }
    
}