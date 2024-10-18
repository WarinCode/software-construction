package testing.test1;

interface Animal {
    public static final int n = 10;
    public abstract void eat();
    public abstract void travel(int i);
}

class Mammal implements Animal {
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void travel(int i) {
        for(int j = 1; j <= i; j++){
            System.out.println("Walk");
        }
    }
}

public class Test {
    public static void main(String []args){
        Animal cat = new Mammal();
        cat.eat();
        cat.travel(Animal.n);
    }
}