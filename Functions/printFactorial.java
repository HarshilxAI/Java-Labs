package Functions;

import java.util.Scanner;

public class printFactorial {
    public static void printFact(int n){
        if(n < 0){
            System.out.println(" Invalid number ");
            return;
        }
        int Factorial = 1;
        for(int i=n ; i>=1 ; i--){
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return; 
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n : ");
            int n = sc.nextInt();

            printFact(n);
        }
    }
    
}
