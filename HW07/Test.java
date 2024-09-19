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
        System.out.println("Price = " + pizza.getPrice());
    }
}
