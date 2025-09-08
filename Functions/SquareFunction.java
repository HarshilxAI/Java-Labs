package Functions;

import java.util.Scanner;

public class SquareFunction{
    public static int square(int n){
        return n*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int result = square(num);
        System.out.println("Square = " + result);

        sc.close();
    }
}