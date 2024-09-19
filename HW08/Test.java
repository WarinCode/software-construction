package HW08;

public class Test {
    public static void main(String []args){
        String []pizzaToppings = { "Cheese", "Pepperoni", "Supreme", "Hawaiian" };

        Pizza pizza = new Pizza();
        for(String pizzaTopping : pizzaToppings) {
            pizza.addTopping(pizzaTopping);
        }
        System.out.println("Pizza1");
        pizza.printAllToppings();
        System.out.println("Total topping = " + pizza.getTotalToppings());
        System.out.println("Price of pizza with toppings = " + pizza.getPrice());
        System.out.println();

        Pizza pizza2 = new Pizza();
        System.out.println("Pizza2");
        System.out.println("Price of pizza without toppings = " + pizza2.getPrice());
        System.out.println();

        Pizza pizza3 = new Pizza(new String[]{ pizzaToppings[1], pizzaToppings[3] });;
        System.out.println("Pizza3");
        pizza3.printAllToppings();
        System.out.println("Total topping = " + pizza3.getTotalToppings());
        System.out.println("Price of pizza with toppings = " + pizza3.getPrice());
        System.out.println();
    }
}
