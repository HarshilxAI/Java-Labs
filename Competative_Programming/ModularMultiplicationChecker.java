package Competative_Programming;
import java.util.Scanner;
public class ModularMultiplicationChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a, b, p and k: ");
        long a = sc.nextLong();
          long b = sc.nextLong();

         long p =sc.nextLong();
        long k = sc.nextLong();

          sc.close();

           long modPrd= (a%p*b%p)%p;
            if(modPrd%k==0){
                System.out.println("Divisible ");

            }
            else{
                 System.out.println("Not Divisible    ");
            }
            }
}
    
    

