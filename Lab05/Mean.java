package Lab05;

public class Mean {
    public static final int DEFAULT_SIZE = 1000;

    public static int getRandomNumber(){
        return (int)(Math.random() * 101);
    }

    public static int getSum(int ...array){
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }

    public static double getMean(int sum){
        return (double)sum / (double)DEFAULT_SIZE;
    }

    public static void main(String[] args) {
        int []array = new int[DEFAULT_SIZE];
        for(int i = 0; i < DEFAULT_SIZE; i++){
            array[i] = getRandomNumber();
        }
        int sum = getSum(array);
        double mean = getMean(sum);

        System.out.println("Sum = " + sum);
        System.out.println("Mean = " + mean);
    }
}
