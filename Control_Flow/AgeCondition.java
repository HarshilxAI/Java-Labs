import java.util.*;
public class AgeCondition {
    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter you age : " );
            int age = sc.nextInt();
            

            if(age>=18){
                System.out.println("You are an Adult");
            } else {
                System.out.println("You are Not Adult");
            }
        }
    }
}
    
