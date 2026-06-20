package Strings;
import java.util.*;

public class Reverse_a_String {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a string: ");
        String s = sc.nextLine();
         String r = "";

              for (int i = 0; i < s.length(); i++){
            
            r = s.charAt(i) + r; 
        }
          System.out.println(r);

          sc.close();
    }  
}
