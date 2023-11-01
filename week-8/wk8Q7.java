import java.util.Scanner;

/*Write a java program to input any number and find out if it’s odd or even.
*/
public class wk8Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scan.nextInt();

        String result = number%2==0 ? "Even" : "Odd";

        System.out.println(number +" Number is "+ result);
    }

    }



