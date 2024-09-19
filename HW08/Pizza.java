package HW08;

public class Pizza {
    private final int MAX_TOPPING = 10;
    private final int MAX_SIZE = this.MAX_TOPPING;
    private String[] toppings = new String[this.MAX_SIZE];
    private int totalToppings;

    public Pizza(){}
    public Pizza(String []toppings) throws ArrayIndexOutOfBoundsException {
        this.toppings = toppings;
        for(String topping : this.toppings){
            this.addTopping(topping);
        }
    }

    public void addTopping(String topping) throws ArrayIndexOutOfBoundsException {
        if(this.totalToppings < 0 || this.totalToppings >= this.MAX_SIZE){
            throw new ArrayIndexOutOfBoundsException("Invalid index!");
        }
        this.toppings[this.totalToppings++] = topping;
    }

    public void printAllToppings(){
        if(this.totalToppings == 0){
            System.out.println("This pizza has no toppings!");
            return;
        }

        System.out.println("Topping list");
        for(int i = 0; i < this.toppings.length; i++){
            if(this.toppings[i] == null){
                continue;
            }
            System.out.printf("%d. %s\n", i + 1, this.toppings[i]);
        }
    }

    public int getPrice(){
        return 100 + (totalToppings * MAX_TOPPING);
    }

    public int getTotalToppings(){
        return this.totalToppings;
    }
}
