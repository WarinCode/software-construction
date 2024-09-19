package counter.test;
import counter.Counter;

public class Test {
    public static void main(String []args){
        Counter counter = new Counter();
        counter.up();
        System.out.println("Number = " + counter.getNumber());
        counter.up();
        counter.up();
        System.out.println("Number = " + counter.getNumber());
        counter.down();
        System.out.println("Number = " + counter.getNumber());
    }
}
