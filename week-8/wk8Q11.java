import java.util.Scanner;

/*
11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.
 */
public class wk8Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = input.next().charAt(0);

        if (alphabet >= 'A' && alphabet <= 'F') {

            if (alphabet == 'A') {
                System.out.println("City: Aanad");
            } else if (alphabet == 'B') {
                System.out.println("City: Baroda");
            } else if (alphabet == 'C') {
                System.out.println("City: Chandigadh");
            } else if (alphabet == 'D') {
                System.out.println("City: Dakor");
            } else if (alphabet == 'E') {
                System.out.println("City: Europe");
            } else if (alphabet == 'F') {
                System.out.println("City: Faridabad");
            }
        } else {
            System.out.println("Invalid entry");
        }
    }
}


