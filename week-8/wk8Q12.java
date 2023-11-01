import java.util.Scanner;

/*
11. Input any alphabet from “A" to “F” and print their city name accordingly if any
other alphabet should be invalid entry.
12. Same as above program-8 using switch statement.
 */
public class wk8Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = input.next().charAt(0);

        switch (alphabet) {
            case 'A':
                System.out.println("City: Ahemdabad");
                break;
            case 'B':
                System.out.println("City: Baroda");
                break;
            case 'C':
                System.out.println("City: Chennai");
                break;
            case 'D':
                System.out.println("City: Delhi");
                break;
            case 'E':
                System.out.println("City: Europe");
                break;
            case 'F':
                System.out.println("City: Farnsisco");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet between A and F.");
        }
    }
}
