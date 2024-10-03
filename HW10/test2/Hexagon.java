package HW10.test2;

public class Hexagon extends Shape {
    public Hexagon(double side){
        super(side);
    }

    public double getArea(){
        return 6 * (Math.sqrt(3) / 4) * Math.pow(this.side, 2);
    }
}
