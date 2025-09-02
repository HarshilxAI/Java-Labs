package Functions;

import java.util.Scanner;

public class Multiply {
    public static int Product(int a , int b ){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("Product of a and b is " + Product(a, b));
    }
    
}
