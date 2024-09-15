package HW07;

public class Day {
    private int index = 0;
    private String []days = { "วันอาทิตย์", "วันจันทร์", "วันอังคาร", "วันพุธ", "วันพฤหัสบดี", "วันศุกร์", "วันเสาร์" };

    public void print(){
        System.out.println(days[index]);
    }

    public void next(){
        index++;
    }
}
