package Lab02;
import java.util.Scanner;
import Lab02.*;

public class Test {
    public static int money = 0;
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your money: ");
        try {
            money = scanner.nextInt();
        } catch (Exception e){
           System.out.println("Error: Please enter a number only.");
        } finally {
            if(money != 0){
                ThaiBanknotes.b1000 = money / 1000;
                money %= 1000;
                ThaiBanknotes.b500 = money / 500;
                money %= 500;
                ThaiBanknotes.b100 = money / 100;
                money %= 100;
                ThaiBanknotes.b50 = money / 50;
                money %= 50;
                ThaiBanknotes.b20 = money / 20;
                money %= 20;
                ThaiCoins.c10 = money / 10;
                money %= 10;
                ThaiCoins.c5 = money / 5;
                money %= 5;
                ThaiCoins.c2 = money / 2;
                money %= 2;
                ThaiCoins.c1 = money;

                ThaiBanknotes.print();
                ThaiCoins.print();
            }
        }
    }
}
