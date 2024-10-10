package HW10;
import java.util.ArrayList;

public class TestArrayList {
    public final int MAX_SIZE = 5;
    public <T extends Double> ArrayList<T> getRandomNumbers(){
        ArrayList<T> numbers = new ArrayList<T>(0);

        for(int i = 0; i < MAX_SIZE; i++){
            numbers.add((T) new Double(Math.floor(Math.random() * 10)));
        }

        return numbers;
    }

    public static void main(String []args){
        TestArrayList testArrayList = new TestArrayList();
        ArrayList<Double> numbers = testArrayList.getRandomNumbers();
        System.out.println(numbers);
        numbers.remove(0);
        numbers.remove(1);
        System.out.println(numbers);
        numbers.set(0, 3.45);
        System.out.println(numbers);
    }
}
