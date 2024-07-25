package Lab04;
import java.util.Scanner;
import java.util.ArrayList;

public class TestArray{
    public static void main(String[] args){
        run();
    }

    public static void run(){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            System.out.printf("Enter a number %d : ", i + 1);
            value = sc.nextInt();
            array.add(value);
        }

        String text = "";
        for(int j = 0; j < array.size(); j++){
            text = array.get(j) % 2 == 0 ? "even" : "odd";
            System.out.printf("The number of array[%d] is %s number\n", j, text);
        }
    }
}














//        Scanner sc = new Scanner(System.in);
//        int value = 0;
//        int n = sc.nextInt();
//        int[] numbers = new int[n];
//
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print("Enter a number " + (i + 1) + " : ");
//            value = sc.nextInt();
//            numbers[i] = value;
//        }
//
//        for(int j = 0; j < numbers.length; j++){
//            if(numbers[j] % 2 == 0){
//                System.out.println("The number of array[" + j + "]" +  " is even number");
//            } else {
//                System.out.println("The number of array[" + j + "]" +  " is odd number");
//            }
//        }