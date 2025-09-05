package Arrays;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int [5];

        System.out.print("Enter any 5 numbers : ");

        for(int i=0 ; i<5; i++){
            num[i] = sc.nextInt();
        }
         int max = num[0];
         for ( int i=0; i<5 ; i++){
            if(num[i] > max){
                max = num[i];
            }
         }

         System.out.print(" Maximum number is : ");
         System.out.println(max);
         sc.close();

    }
    
}
