import java.util.Scanner;

/*
13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)
 */
public class wk8Q13A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if (operator == '/') {
            result = num1 / num2;
            System.out.println("Result: " + result);
            }
            else {
                System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Error: Invalid operator.");
        }
    }
}



