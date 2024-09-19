package b;
import a.Rectangle;

public class Test {
    public static void main(String []args){
        Rectangle rectangle = new Rectangle();
        boolean isValid = false;
        try {
            rectangle.setWidth(8);
            rectangle.setHeight(9);
            isValid = true;
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        } finally {
            if(isValid){
                System.out.println("Width = " + rectangle.getWidth());
                System.out.println("Height = " + rectangle.getHeight());
                rectangle.calculateArea();
                System.out.println("Area = " + rectangle.getArea());
            }
        }
    }
}
