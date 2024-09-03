package HW07;

public class Square {
    private int side = 0;
    private int area = 0;

    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public void calculate(){
        this.area = this.side * this.side;
    }

    public int getArea(){
        return this.area;
    }
}
