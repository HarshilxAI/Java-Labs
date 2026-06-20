import java.util.*;

public class NumberCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Case 1: a is greater than b");
        } else if (a < b) {
            System.out.println("Case 2: a is smaller than b");
        } else {
            System.out.println("Case 3: a is equal to b");
        }
    }
} 