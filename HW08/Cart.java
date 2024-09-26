package HW08;

public class Cart {
    public static void main(String []args){
        Cart cart = new Cart();
        Priceable []products = new Priceable[]{
                new Car("Tesla Model 3", 34990),
                new Car("Tesla Model S", 68490),
                new Motorcycle("DesertX", 20473.47, 1),
                new Motorcycle("Panigale V2", 25369.96)
        };
        products[0].addItem(1);
        products[3].addItem(2);

        System.out.println("Product List");
        for(int i = 0; i < products.length; i++){
            Priceable product = products[i];
            System.out.println("Product " + (i + 1));
            System.out.println("Product: " + product.getProductName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println();
        }
        System.out.printf("Sum price: $%.2f", (float) cart.sumPrice(products));
    }

    public double sumPrice(Priceable ...products){
        double sum = 0;
        for(Priceable product : products){
            sum += product.getPrice() * product.getQuantity();
        }
        return sum;
    }

}
