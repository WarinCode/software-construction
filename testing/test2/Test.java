package testing.test2;

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public int number = 1;
}

class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    public void print(){
        System.out.println("This is a cat");
    }
}

public class Test {
    public static void main(String []args){
        Animal a = new Cat();
        a.eat();
        a.sleep();
        System.out.println(a.number);
        Cat cat = new Cat();
        cat.print();
    }
}
