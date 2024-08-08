package midterm;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Test{
    public class PrimeNumber {
        public static boolean isPrimeNumber(int number){
            if(number < 2){
                return false;
            }
            int counter = 0;
            for(int i = 2; i <= number; i++){
                if(number % i == 0){
                    counter++;
                }
            }
            if(counter == 1){
                return true;
            }
            return false;
        }
    }

    public static void main(String []args){
        System.out.println();
    }
}
