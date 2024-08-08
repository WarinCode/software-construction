package HW05;

public class Array2D {
    public static void main(String []args){
        findIndex(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, 6);
    }

    public static void findIndex(int [][]array2d, int number){
        for(int i = 0; i < array2d.length; i++){
            for(int j = 0; j < array2d[i].length; j++){
                if(array2d[i][j] == number){
                    System.out.printf("The value of %d is in the array[%d][%d]", number, i, j);
                }
            }
        }
    }
}
