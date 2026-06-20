package Arrays;
import java.util.*;

public class MultidimensionalArray {
    
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
for (int[] innerArray : a) {
            for (int data : innerArray) {
                System.out.println(data);
            }
        }
        sc.close();
    }
}
