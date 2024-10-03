package HW10.test1;

public class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("Cat eat");
    }

    @Override
    public void fly(){
        System.out.println("Cat fly");
    }

    public void sleep(){
        System.out.println("Cat sleep");
    }
}
