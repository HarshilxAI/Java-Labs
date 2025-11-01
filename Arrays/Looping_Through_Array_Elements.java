package Arrays;
import java.util.*;

public class Looping_Through_Array_Elements {
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] age = new int[3];

            System.out.println("Enter 3 ages:");
            for(int i = 0; i < age.length; i++) {
                age[i] = sc.nextInt();
            }

            System.out.println("Using for Loop:");
            for(int i = 0; i < age.length; i++) {
                System.out.println(age[i]);
            }

            sc.close();
        }
    }
}
