package HW02;
import java.util.Scanner;

public class MoneyClassification {
    public static Scanner sc  = null;
    public static int money = 0;

    public static void main(String []args){
        System.out.print("Enter your money: ");
        sc = new Scanner(System.in);

        try {
            money = sc.nextInt();
        } catch(Exception e){
            System.out.println("Invalid money! \nPlease enter only positive number.");
            System.exit(0);
        } finally {
            if(money > 0){
                MoneyCounter.classify(money);
                MoneyCounter.showMoney();
            } else {
                System.out.println("Invalid money! \nPlease enter only positive number.");
            }
        }
    }
}

class MoneyCounter {
    public static int m1000 = 0;
    public static int m500 = 0;
    public static int m100 = 0;
    public static int m50 = 0;
    public static int m20 = 0;
    public static int m10 = 0;
    public static int m5 = 0;
    public static int m2 = 0;
    public static int m1 = 0;

    public static void classify(int money){
        m1000 = money / 1000;
        money %= 1000;
        m500 = money / 500;
        money %= 500;
        m100 = money / 100;
        money %= 100;
        m50 = money / 50;
        money %= 50;
        m20 = money / 20;
        money %= 20;
        m10 = money / 10;
        money %= 10;
        m5 = money / 5;
        money %= 5;
        m2 = money / 2;
        money %= 2;
        m1 = money;
    }

    public static void showMoney(){
        int []moneyArray = { m1000, m500, m100, m50, m20, m10, m5, m2, m1 };
        String []textArray = { "1000 -> ", "500 -> ", "100 -> ", "50 -> ", "20 -> ", "10 -> ", "5 -> ", "2 -> ", "1 -> " };

        for(int i = 0; i < moneyArray.length; i++){
            if(moneyArray[i] != 0){
                System.out.println(textArray[i] + moneyArray[i]);
            }
        }
    }
}