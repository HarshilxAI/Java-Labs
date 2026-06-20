package Functions;

import java.util.Scanner;

public class PalindromeCheck {

    static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a Palindrome!");
        } else {
            System.out.println( word + " is NOT a Palindrome!");
        }

        sc.close();
    }
    
}
