package HW10.test1;

public class Test {
    public static void main(String[] args) {
        Priceable t = new TV();
        t.setPrice(50000);
        int money = t.getPrice();
        System.out.println("TV's price is "+money);
        Bird b = new Bird();
        b.setPrice(200);
        System.out.println("Bird's price is "+b.getPrice());
        Animal a = new Cat();
        System.out.println(a.calculate(5, 10));
        a.eat();
        a.fly();
        Cat c = new Cat();
        c.sleep();
    }
}