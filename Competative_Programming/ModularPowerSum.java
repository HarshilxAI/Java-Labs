package Competative_Programming;

import java.util.Scanner;
public class ModularPowerSum {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
           int n=sc.nextInt();
              long p=sc.nextLong();
          long total=0;

          for(int i=0; i<n; i++){
               long a =sc.nextLong();
              long m =sc.nextLong();
              total = (total+ modExp(a,m,p))%p;
         }


        sc.close();

          System.out.println(total  );
    }

      private static long modExp(long a, long m, long p) 
      {
        
           throw new UnsupportedOperationException("Unimplemented method 'modExp'");
    }
    
}
