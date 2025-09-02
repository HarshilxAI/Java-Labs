package Functions;

import java.util.Scanner;

public class CalculateSum {
    public static int CalSum(int a , int b){
        int sum = a + b ;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter the value of b : ");
            int b = sc.nextInt();

            int sum = CalSum(a,b);
            System.out.print("Sum of a and b is : ");
            System.out.println(sum);
        }
    }
}
