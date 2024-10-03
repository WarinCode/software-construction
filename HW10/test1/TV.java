package HW10.test1;

public class TV implements Priceable{
    private int price;

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
