package Arrays;

import java.util.Scanner;

public class SubjectMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects : ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.print("Enter the marks : ");
        for(int i =0 ; i<n ; i++){
            marks[i] = sc.nextInt();
        }
        System.out.print("You entered : ");
        for ( int i=1 ; i<n ; i++){
            System.out.println("Subject " + (i+1)+ " : " + marks[i]);
        }
        sc.close();
    }
    
}
