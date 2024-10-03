package HW10.test2;

public class Decagon extends Shape{
    public Decagon(double side){
        super(side);
    }

    public double getArea(){
        return ((double)5 / 2) * Math.pow(this.side, 2) * Math.sqrt((5 + 2 * Math.sqrt(5)));
    }
}