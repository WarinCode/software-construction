package HW10;
import java.util.Collection;
import java.util.HashSet;

public class TestHashSet {
    public static void main(String []args){
        Collection<Integer> dataSet = new HashSet<Integer>();

        for(int i = 0; i < 10; i++){
            dataSet.add((int) Math.floor(Math.random() * 100));
        }

        System.out.println(dataSet);
    }
}
