package HW10.test3;

public class Nisit extends Person {
    private String major;

    public void setMajor(String s){
        this.major = s;
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + ", Major: " + this.major;
    }
}
