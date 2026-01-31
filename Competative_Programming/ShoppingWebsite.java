package Competative_Programming;

import java.util.Scanner;

public class ShoppingWebsite {
    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Website!");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total purchase amount: ");


           int amount = sc.nextInt();
        double finalAmount; 
         double discountPercent;
           if(amount<1000){
             discountPercent=0;
              finalAmount=amount;

        }

        else if(amount<5000)

            {
 discountPercent=10;
            finalAmount=amount-(amount*0.1);
        }
else if (amount<10000){
discountPercent=20;
    finalAmount=amount-(amount*0.2);

}
else{
    discountPercent=25;
    finalAmount=amount-(amount*0.25)-500;
}
  System.out.println("Discount Applied: " + discountPercent + "%");
System.out.println("Final amount to be paid: " + (int)finalAmount);;
    sc.close();

    }
    
}
