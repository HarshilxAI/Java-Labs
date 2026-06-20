package Arrays;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] num = new int[n];

        System.out.print(" Enter the elements of array : ");
        for ( int i=0; i<n ; i++){
            num[i] = sc.nextInt();
        }

        int even = 0 , Odd = 0;
        for (int i=0; i<n ; i++){
            if(num[i]%2 == 0){
            even++;
            }else{
                Odd++;
            }
        }

        System.out.print("Total Even number : ");
        System.out.println(even);
        System.out.print("Total Odd number : ");
        System.out.println(Odd);
    }


}
