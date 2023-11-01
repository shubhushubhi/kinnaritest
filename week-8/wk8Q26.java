import java.util.Scanner;

/*
26. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
 */
public class wk8Q26 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print(" ");

        // Read a word from the user
        String a = in.nextLine();

        // Trim any leading or trailing whitespaces
        a = a.trim();

        // Initialize an empty string for the reversed word
        String result = "";

        // Convert the word to a character array
        char[] ch = a.toCharArray();

        // Reverse the word by iterating through the characters
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }

        // Print the reversed word
        System.out.println(" Reverse word " + result.trim());
    }
}






