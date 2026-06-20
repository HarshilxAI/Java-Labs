package Functions;

import java.util.*;

public class printMyName {

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            String name = sc.nextLine();

            printMyName(name);
        }
        
    }
}