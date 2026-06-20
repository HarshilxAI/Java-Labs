package Arrays;
import java.util.*;

public class Two_D_Array {
    
    class MultidimensionalArray {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");

        int rows = sc.nextInt();

        int[][] a = new int[rows][];
        
        for (int i = 0; i < rows; i++) {

            System.out.print("Enter number of columns in row " + (i + 1) + ": ");

            int cols = sc.nextInt();

            a[i] = new int[cols];
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");

            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
        }
     }



        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        sc.close();
        
    }
}
}
