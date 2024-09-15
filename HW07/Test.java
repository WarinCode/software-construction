package HW07;

public class Test {
    public static void main(String[] args) {
        Day d = new Day();
        d.print(); // พิมพ์วันอาทิตย์
        d.next();
        d.print(); // พิมพ์วันจันทร์
        Day e = new Day();
        for(int i = 0; i < 7; i++){ //พิมพ์ทุกวันในสัปดาห์
            e.print();
            e.next();
        }
    }
}
