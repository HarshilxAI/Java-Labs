package Competative_Programming;

import java.util.Scanner;

public class FinalOrderCost {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


            System.out.print("Enter subtotal amount: ");

                int subtotal=sc.nextInt();


           double percentageDiscount=0;
           int fixedDiscount=0;

               if (subtotal>500) {

               percentageDiscount=subtotal*0.10;
          }

            if (subtotal>1000) {
               fixedDiscount=150;
            }

                 double discount=Math.max(percentageDiscount,fixedDiscount);

                int finalCost=(int)(subtotal-discount);


           System.out.println("Final Order Cost: "+finalCost);
 
            sc.close();
    }}

