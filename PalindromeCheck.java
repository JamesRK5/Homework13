package homework;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Please enter a word to check if its a palindrome");
        Scanner inp = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(inp.next());
        String forwards = stringBuilder.toString();
        StringBuilder stringBuilder1 = stringBuilder.reverse();
        String backwards = stringBuilder1.toString();
        boolean areEqual = forwards.equals(backwards);
        if (areEqual){
                System.out.println(forwards+" is a palindrome!");
            }else{
                System.out.println(forwards+" is not a palindrome.");
        }
    }
}
