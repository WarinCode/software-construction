package HW10.test2;

public class Octagon extends Shape{
    public Octagon(double side){
        super(side);
    }

    @Override
    public double getArea() {
        return 2 * Math.pow(this.side, 2) * (1 + Math.sqrt(2));
    }
}
