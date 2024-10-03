package Lab09;

public class Rectangle extends Shape {
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double height){
        super(width, height);
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public String toString(){
        return "width = " + this.width + ", height = " + this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        if(width > 0){
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height > 0){
            this.height = height;
        }
    }
}
