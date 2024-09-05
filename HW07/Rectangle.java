package HW07;

public class Rectangle {
    private int width = 0;
    private int height = 0;
    private int area = 0;

    public Rectangle(){}
    public Rectangle(int width, int height){
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void calculateArea(){
        this.area = this.getWidth() * this.getHeight();
    }

    public int getArea(){
        return this.area;
    }
}
