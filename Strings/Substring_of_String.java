package Strings;
import java.util.Scanner;

public class Substring_of_String {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a string: " );
        String s = sc.nextLine();
        System.out.println("Enter starting index: ");
        int start = sc.nextInt();

        String sub  = s.substring(start);

        System.out.println("Substring: " + sub);

        sc.close();
    }
}
    
