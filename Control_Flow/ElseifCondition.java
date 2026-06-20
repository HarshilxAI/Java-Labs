import java.util.*;

public class ElseifCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is the greatest: " + b);
        } else if (c > a && c > b) {
            System.out.println("c is the greatest: " + c);
        } else {
            System.out.println("Two or more numbers are equal.");
        }

        sc.close();
    }
}
