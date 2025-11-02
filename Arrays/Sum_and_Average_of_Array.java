package Arrays;
import java.util.*;

public class Sum_and_Average_of_Array {

 public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number of Elements: ");
   int n = sc.nextInt();


   
   int[] numbers = new int[n];
   System.out.println("Enter " + n + " numbers:");
   for (int i = 0; i < n; i++) {


     numbers[i] = sc.nextInt();
     
   }



   int sum = 0;
   Double average;
   
   for (int number: numbers) {
     sum += number;
   }

   int arrayLength = numbers.length;
   average = ((double)sum / (double)arrayLength);

   System.out.println("Sum = " + sum);
   System.out.println("Average = " + average);

   sc.close();
 }
}
