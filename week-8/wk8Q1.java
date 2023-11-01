import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)
 */
public class wk8Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scan.nextInt();
        //ternary operator to check number
        String result = number%2==0 ? "Even" : "Odd";

        System.out.println(number +" Number is "+ result);
    }
}
