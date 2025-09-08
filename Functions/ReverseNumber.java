package Functions;

import java.util.Scanner;

public class ReverseNumber {

    static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit ;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int result = reverse(num);
        System.out.println("Reversed number : " + result );

        sc.close();
    }


    
}
