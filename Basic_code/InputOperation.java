import java.util.*;
class InputOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int b = sc.nextInt();


        int sum = a + b ;
        int diff = a - b ;
        int mul = a * b ;
        int div = a / b ; 

        System.out.println("The sum of " + a + " and " + b + " is : " + sum);
        System.out.println("The diff of " + a + " and " + b + " is : " + diff);
        System.out.println("The multiply of " + a + " and " + b + " is : " + mul);
        System.out.println("The division of " + a + " and " + b + " is : " + div);
        
        sc.close();
    }
}
