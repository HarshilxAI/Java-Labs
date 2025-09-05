package Arrays;

import java.util.Scanner;

public class SearchInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 numbers:");

        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        boolean found = false;
        
        for(int i=0; i<5; i++) {
            if(arr[i] == key) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Number not found");
        }
        sc.close();
    }
    
}
