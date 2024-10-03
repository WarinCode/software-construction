package HW10.test2;

public class Test {
    public static void main(String []args){
        double sumArea = ShapeArray.sumArea(new Shape[]{
                new Hexagon(10),
                new Octagon(12),
                new Decagon(15)
        });
        System.out.println(sumArea);
    }
}
