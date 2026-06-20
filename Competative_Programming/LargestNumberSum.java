package Competative_Programming;

import java.util.Scanner;


public class LargestNumberSum {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long m = sc.nextLong();
    long sum=0;


         for(int i=0;i<n;i++)
    {
          sum+=sc.nextLong();
    }

       System.out.println(sum%m);

sc.close();
  }


    
}
