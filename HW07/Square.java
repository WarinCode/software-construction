package HW07;

public class Square {
    private int side = 0;
    private int area = 0;

    public Square(){}
    public Square(int side){
        this.setSide(side);
    }

    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public void calculate(){
        this.area = this.getSide() * this.getSide();
    }

    public int getArea(){
        return this.area;
    }
}
