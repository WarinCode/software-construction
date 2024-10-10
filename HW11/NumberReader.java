package HW11;
import java.util.*;

public class NumberReader<K extends Integer, V extends String> extends HashMap<K, V>{
    public Scanner input = new Scanner(System.in);
    private K key = (K) new Integer(0);
    private V value = null;

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) throws IllegalArgumentException {
        if(key.intValue() >= 0){
            this.key = key;
            if(!this.containsKey(this.getKey())){
                System.out.println("I don't know how to read this number");
                System.out.print("Please tell me:");
                this.setValue((V) (this.input.next()));
                this.put(this.key, this.value);
            } else {
                System.out.println(this.get(this.getKey()));
            }
            return;
        }
        throw new IllegalArgumentException("Invalid key!");
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) throws IllegalArgumentException {
        if(!value.isEmpty() && !value.isBlank()){
            this.value = value;
            return;
        }
        throw new IllegalArgumentException("Invalid value!");
    }

    public static void main(String []args){
        NumberReader<Integer, String> nr = new NumberReader<Integer, String>();

        while(true){
            try {
                System.out.print("Enter an integer: ");
                nr.setKey(nr.input.nextInt());
            } catch (IllegalArgumentException e){
                System.out.println(nr);
                break;
            }
        }
    }
}
