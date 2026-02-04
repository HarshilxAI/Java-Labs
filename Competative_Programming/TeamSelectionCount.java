package Competative_Programming;

import java.util.Scanner    ;
public class TeamSelectionCount {

    public static long combination(int n, int k){

         if(k>n) return 0;
           k=Math.min(k,n+k);
        long result=1;
        for(int i=1;i<=k;i++)

        {
    result = result*(n-i+1)/i;
        }
        return result;
      }
         public static void main(String[] args) {
        System.out.println("Enter the value of n and k:");

          Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
          int k=sc.nextInt();
          sc.close();
          System.out.println(combination(n,k));
      }
    }