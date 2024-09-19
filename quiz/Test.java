package quiz;
import quiz.Calculation;

public class Test {
    public static void main(String []args){
        Calculation.add(1, 2);
        System.out.println("1 + 2 = " + Calculation.getResult());
        Calculation.subtract(5, 2);
        System.out.println("5 - 2 = " + Calculation.getResult());
        Calculation.multiply(2, 2);
        System.out.println("2 * 2 = " + Calculation.getResult());
        Calculation.divide(10, 2);
        System.out.println("10 / 2 = " + Calculation.getResult());
    }
}
