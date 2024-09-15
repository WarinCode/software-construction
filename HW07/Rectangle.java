package HW07;

public class Rectangle {
    private double width = 0;
    private double height = 0;
    private double area = 0;

    public Rectangle(){}
    public Rectangle(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width) throws IllegalArgumentException{
        if(width <= 0){
            throw new IllegalArgumentException("Invalid width!");
        }
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void calculateArea(){
        this.area = this.getWidth() * this.getHeight();
    }

    public double getArea(){
        return this.area;
    }
}
