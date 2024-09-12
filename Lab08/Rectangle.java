package Lab08;

public class Rectangle {
    double width;
    double height;

    public Rectangle(){};
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width + this.height;
    }

    @Override
    public String toString(){
        return "width = " + this.width + ", height = " + this.height;
    }

    public boolean equals(Rectangle r){
        return this.width == r.width && this.height == r.height;
    }
}
