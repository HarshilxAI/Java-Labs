package Strings;
import java.util.*;

public class Remove_Space_from_String {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        s = s.replace(" ", "");

        System.out.println("String without spaces: " + s);

        sc.close();
    }
}

    

