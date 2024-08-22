package Lab06;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = null;
        final int SIZE = 4;
        String fileName = "test.txt";
        int []numbers = new int[SIZE];

        for(int i = 0; i < SIZE; i++){
            System.out.printf("Enter a number%d:", i + 1);
            numbers[i] = sc.nextInt();
        }

        try {
            writer = new PrintWriter(fileName);
            for(int i = SIZE - 1; i >= 0; i--){
                writer.println(numbers[i]);
            }
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            writer.close();
            System.out.println("Write file completed.");
        }
    }
}
