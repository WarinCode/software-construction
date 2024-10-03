package HW10.test3;

public class Test{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Somchai");
        System.out.println("Person name = "+p.getName());

        Nisit n = new Nisit();
        n.setName("Somying");
        n.setMajor("ComSci");
        System.out.println(n);
    }
}