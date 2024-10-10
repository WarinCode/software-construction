package HW10;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String []args){
        Set<Integer> numbers = new TreeSet<Integer>();

        for(int i = 1; i <= 4; i++){
            numbers.add(i);
        }

        System.out.println(numbers);
    }
}
