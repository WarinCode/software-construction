package HW03;
import java.util.Scanner;

public class The2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        String newSentence = "";

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 't' && sentence.charAt(i + 1) == 'h' && sentence.charAt(i + 2) == 'e'){
                newSentence += "***";
                i += 2;
            } else {
                newSentence += sentence.charAt(i);
            }
        }

        System.out.println(newSentence);
    }
}
