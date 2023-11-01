/*
13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)
 */
import java.util.Scanner;
public class wk8Q13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter another number: ");
        int b = in.nextInt();
        System.out.print("Enter Symbol + - * /");
        int c = in.nextInt();

        String city = in.next();


        switch (city) {
            case "+":
                System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println("Subtraction of " + a + " and " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));
                break;
            case "/":
                System.out.println("Division of " + a + " and " + b + " = " + (a / b));
                break;
        }
/*
        System.out.println("Addition of " + a + " and " + b + " = " +(a+b));
        System.out.println("Subtraction of " + a + " and " + b + " = " +(a-b));
        System.out.println("Multiplication of " + a + " and " + b + " = " +(a*b));
        System.out.println("Division of " + a + " and " + b + " = " +(b/a));

         */
    }
}