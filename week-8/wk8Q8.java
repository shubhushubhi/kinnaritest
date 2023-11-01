/*
8. Write a java program to get numbers from users and print whether it is positive or negative.
 */
import java.util.Scanner;
public class wk8Q8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scan.nextInt();
//Number is positive
        if(number>0)
        {
            System.out.println("The number is positive.");
        }
//Number is negative
        else if(number<0)
        {
            System.out.println("The number is negative.");
        }
//Number is zero
        else
        {
            System.out.println("The number is zero.");
        }

    }
}
