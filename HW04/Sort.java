package HW04;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.text.Collator;

public class Sort {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("โปรดป้อนจำนวนคำของภาษาไทย : ");
        final int SIZE = sc.nextInt();

        String []thaiWords = new String[SIZE];
        for(int i = 0; i < SIZE; i++){
            System.out.print("คำภาษาไทยคำที่ " + (i + 1) + " : ");
            thaiWords[i] = sc.next();
        }

        System.out.println("คำภาษาไทยคือ : " + String.join(", ", thaiWords));
        Locale locale = new Locale("th");
        Collator collator = Collator.getInstance(locale);
        Arrays.sort(thaiWords, collator);
        System.out.println("เรียงคำภาษาไทยใหม่ที่ได้คือ : " + String.join(", ", thaiWords));
    }
}
