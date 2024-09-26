package Lab08;

public class BattleShip implements Priceable{
    private int age = 1;
    private int originalPrice = 1_000_000;

    @Override
    public int getPrice(){
        //  ค่าเสื่อมราคาต่อปี = ราคาซื้อมา / อายุการใช้งานต่อปี
        return Math.max(this.originalPrice - (this.originalPrice / this.age), 1000);
    }

    public void setAge(int age){
        this.age = age;
    }
}
