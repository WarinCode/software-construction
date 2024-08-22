package HW06;

public class ExceptionError {
    public static void main(String []args){
        String name = null;
        try {
            name = args[0];
            System.out.println("Hello " + name);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter command line arguments!");
        }
    }
}
