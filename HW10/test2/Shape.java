package HW10.test2;

public abstract class Shape {
    protected double side;

    protected Shape(double side){
        this.side = side;
    }

    public abstract double getArea();
}
