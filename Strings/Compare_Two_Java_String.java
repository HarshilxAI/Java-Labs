package Strings;
import java.util.Scanner;
public class Compare_Two_Java_String { 
public class CompareStrings {
  
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();
        System.out.print("Enter third string: ");
        String s3 = scanner.nextLine();


        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }

}
    }
