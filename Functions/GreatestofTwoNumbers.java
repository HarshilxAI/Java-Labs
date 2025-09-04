package Functions;

import java.util.Scanner;

public class GreatestofTwoNumbers {
    static int greatest(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Greatest: " + greatest(a, b));
    }
    
}
