package HW08;

public class Car implements Priceable {
    private String productName;
    private int quantity = 1;
    private double price;

    public Car(String productName, double price){
        this.productName = productName;
        this.price = price;
    }
    public Car(String productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double sumPrice() {
        return this.price * this.quantity;
    }

    @Override
    public void addItem(int quantity) {
        this.quantity += quantity;
    }
}
