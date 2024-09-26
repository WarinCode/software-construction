package Lab08;

public class BattleShip implements Priceable{
    private int age;
    private int originalPrice = 1_000_000;

    @Override
    public int getPrice(){
        int deprecation = age * 100000;
        return Math.max(this.originalPrice - deprecation, 10000);
    }

    public void setAge(int age){
        this.age = age;
    }
}
