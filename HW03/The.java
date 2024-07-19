package HW03;
import java.util.Scanner;

public class The {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringBuffer newSentence = new StringBuffer(sentence.toLowerCase());
        int index = 0;

        while(index != -1){
            index = newSentence.indexOf("the");
            if(index < 0 || (index + 3 ) > newSentence.length()){
                break;
            } else {
                newSentence.delete(index, index + 3);
                newSentence.insert(index, "***");
            }
        }

        System.out.println(newSentence);
    }
}
