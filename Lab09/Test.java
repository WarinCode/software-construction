package Lab09;

public class Test {
    public static void main(String []args){
        Rectangle rec1 = new Rectangle(5, 2);
        System.out.println(rec1);
        System.out.println("Rectangle Area = " + rec1.getArea());

        Rectangle rec2 = new Rectangle();
        rec2.setHeight(3);
        rec2.setWidth(7);
        System.out.println(rec2);
        System.out.println("Rectangle Area = " + rec1.getArea());
    }
}
