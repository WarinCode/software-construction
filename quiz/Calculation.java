package quiz;

public class Calculation {
    private static int result = 0;

    public static void add(int n1, int n2){
        result = n1 + n2;
    }

    public static void subtract(int n1, int n2){
        result = n1 - n2;
    }

    public static void multiply(int n1, int n2){
        result = n1 * n2;
    }

    public static void divide(int n1, int n2){
        result = n1 / n2;
    }

    public static int getResult(){
       return result;
    }

}
