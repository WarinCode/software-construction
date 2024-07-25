package HW04;
import java.util.Scanner;

public class Array {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        final int SIZE = sc.nextInt();

        int []numbers = new int[SIZE];
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number " + (i + 1) + " : ");
            int element = sc.nextInt();
            numbers[i] = element;
        }

        String duplicateNumbers = "";
        for(int j = 0; j < numbers.length; j++) {
            int n = numbers[j];
            int count = 0;
            String str = "";
            if(duplicateNumbers.indexOf(String.valueOf(n)) == -1){
                for (int k = 0; k < numbers.length; k++){
                    if (n == numbers[k]) {
                        ++count;
                        str += " " + k + ",";
                    }
                }
                if(count >= 2){
                    duplicateNumbers += n + " ";
                    str = str.substring(0, str.length() - 1);
                    System.out.println(n + " =" + str);
                }
            }
        }
    }
}
