package HW08;

public class Cart {
    public static void main(String []args){
        Priceable []products = new Priceable[]{
                new Car("Tesla Model Y", 31490, 1),
                new Car("Tesla Model 3", 34990),
                new Car("Tesla Model X", 65990),
                new Car("Tesla Model S", 68490, 1),
                new Motorcycle("DesertX", 20473.47, 1),
                new Motorcycle("Panigale V2", 25369.96, 1)
        };
        products[1].addItem(1);
        products[2].addItem(2);
        products[5].addItem(1);

        System.out.println("Product List");
        for(int i = 0; i < products.length; i++){
            Priceable product = products[i];
            System.out.println("Product " + (i + 1));
            System.out.println("Product: " + product.getProductName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Sum price: $" + product.sumPrice());
            System.out.println();
        }
    }
}
