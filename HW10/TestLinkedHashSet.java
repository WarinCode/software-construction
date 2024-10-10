package HW10;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String []args){
        Set<String> programmingLanguages = new LinkedHashSet<String>();
        programmingLanguages.add("Python");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("C#");
        programmingLanguages.add("Java");
        programmingLanguages.add("TypeScript");

        System.out.println(programmingLanguages);
    }
}
