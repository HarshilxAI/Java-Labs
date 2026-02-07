package Competative_Programming;

import java.util.Scanner;

public class PossibleHandCount {

    static long factorial(int n){
        long factr=1;
        for(int i=1;i<=n;i++){
            factr*=i;

        }
        return factr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N and K:");
        int N =sc.nextInt();
        int K=sc.nextInt();
        sc.close();
        long result=factorial(N)/(factorial(K)*factorial(N-K));

        System.out.println(result);
    }
    
}
