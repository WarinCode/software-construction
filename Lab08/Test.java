package Lab08;

public class Test {
    public static void main(String[] args) {
        BattleShip battleShip = new BattleShip();
        battleShip.setAge(4);

        Priceable item = battleShip;
        System.out.println(item.getPrice());
    }
}
