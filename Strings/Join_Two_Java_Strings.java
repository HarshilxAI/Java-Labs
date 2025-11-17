package Strings;
import java.util.*;

public class Join_Two_Java_Strings {
    
  public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

    
      System.out.print("Enter first string: ");
    String first = sc.nextLine();
      System.out.println("First String: " + first);

                  
       System.out.print("Enter second string: ");
    String second = sc.nextLine();
       System.out.println("Second String: " + second);

String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        sc.close();
  }
}
