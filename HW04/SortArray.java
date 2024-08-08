package HW04;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        final int DEFAULT_SIZE = 5;
        int []array = new int[DEFAULT_SIZE];

        for(int i = 0 ; i < DEFAULT_SIZE; i++){
            System.out.printf("Enter number %d: ", i + 1);
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int []array2 = new int[DEFAULT_SIZE];
        for(int j = DEFAULT_SIZE - 1, k = 0; j >= 0; j--, k++){
            array2[k] = array[j];
        }
        System.out.println(Arrays.toString(array2));
    }
}
