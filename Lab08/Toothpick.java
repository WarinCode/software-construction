package Lab08;

public class Toothpick implements Priceable{
    public String getToothpick(){
        return "Toothpick";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
