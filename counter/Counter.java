package counter;

public class Counter {
    private int number;

    public void up(){
        this.number++;
    }

    public void down(){
        this.number--;
    }

    public int getNumber(){
        return this.number;
    }
}
