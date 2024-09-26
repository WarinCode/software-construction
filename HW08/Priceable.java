package HW08;

public interface Priceable {
    public String getProductName();
    public int getQuantity();
    public double getPrice();
    public void addItem(int quantity);
}
