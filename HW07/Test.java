package HW07;
import HW07.Pizza;

public class Test {
    public static void main(String []args){
        Pizza pizza = new Pizza();
        String []pizzaToppings = { "Cheese", "Pepperoni", "Supreme", "Hawaiian" };

        try {
            for(String pizzaTopping : pizzaToppings){
                pizza.addTopping(pizzaTopping);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        pizza.printAllToppings();
        System.out.println("Total topping = " + pizza.getTotalToppings());
        System.out.println("Price of pizza with toppings  = " + pizza.getPrice());

        Pizza pizza2 = new Pizza();
        System.out.println("Price of pizza without toppings  = " + pizza2.getPrice());
    }
}
