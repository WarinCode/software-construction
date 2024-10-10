package HW11;
import java.util.*;

public class WordCounter {
    public static void main(String []args){
        String[] a = {"cat", "ant", "dog", "bat", "ant", "dog", "cat", "emu", "ant"};
        Set<String> set = new HashSet();
        Map<String, Integer> map = new HashMap();

        for(int i = 0; i < a.length; i++){
            String key = a[i];
            set.add(key);
            if(!map.containsKey(key)){
                map.put(key, 0);
            }

            if(map.containsKey(key)){
                map.replace(key, map.get(key) + 1);
            }
        }

        System.out.println(set.size());
        System.out.println(set);
        System.out.println(map);
    }
}
