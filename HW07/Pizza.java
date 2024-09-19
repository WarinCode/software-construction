package HW07;

public class Pizza {
    private final int MAX_TOPPING = 10;
    private String[] toppings = new String[this.MAX_TOPPING];
    private int totalToppings;

    public Pizza(){}

    public void addTopping(String topping) throws ArrayIndexOutOfBoundsException {
        if(this.totalToppings < 0 || this.totalToppings >= 10){
            throw new ArrayIndexOutOfBoundsException("Invalid index!");
        }
        this.toppings[this.totalToppings++] = topping;
    }

    public void printAllToppings(){
        System.out.println("Topping list");
        for(String topping : this.toppings){
            if(topping == null){
                continue;
            }
            System.out.println("- " + topping);
        }
    }

    public int getPrice(){
        return 100 + (totalToppings * MAX_TOPPING);
    }

    public int getTotalToppings(){
        return this.totalToppings;
    }
}
