package Lab06;
import java.util.Scanner;

public class TryCatch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            i = Integer.parseInt(sc.next());
        } catch(NumberFormatException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(i);
    }
}
