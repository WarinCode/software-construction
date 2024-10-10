package HW10;
import java.util.LinkedList;

public class TestLinkedList<E extends String> extends LinkedList<E>{
    public static void main(String []args){
        TestLinkedList<String> letters = new TestLinkedList<String>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");

        System.out.println(letters);
        for(int i = 0; i < letters.size(); i++){
            letters.set(i, letters.get(i).toUpperCase());
        }
        System.out.println(letters);
    }
}
