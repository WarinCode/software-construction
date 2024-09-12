package Lab08;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println(r.getArea());

        Rectangle p = new Rectangle();
        System.out.println(p.getArea());

        Rectangle s = new Rectangle();
        s.width = 5;
        s.height = 10;
        System.out.println(s.getArea());
    }
}
