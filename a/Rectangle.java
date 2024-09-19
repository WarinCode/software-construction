package a;

public class Rectangle {
    private double width;
    private double height;
    private double area;

    public Rectangle(){}
    public Rectangle(double width, double height) throws IllegalArgumentException {
        this.setWidth(width);
        this.setHeight(height);
    }

    public void calculateArea(){
        this.area = this.width * this.height;
    }

    public double getArea(){
        return this.area;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width) throws IllegalArgumentException{
        if(width <= 0) {
            throw new IllegalArgumentException("Invalid width!");
        }
        this.width = width;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if(height <= 0){
            throw new IllegalArgumentException("Invalid height!");
        }
        this.height = height;
    }
}
