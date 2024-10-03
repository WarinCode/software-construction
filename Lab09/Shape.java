package Lab09;

public abstract class Shape {
    protected double width;
    protected double height;

    protected Shape(){}
    public Shape(double width, double height){
        this.width = width;
        this.height = height;
    }
    public abstract double getArea();
}
