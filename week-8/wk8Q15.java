import java.util.Scanner;
/*
Write a program that tells us input value is number or an alphabet or symbol.
 */
public class wk8Q15 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any caracter : ");
            char ch = scanner.next().charAt(0);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                System.out.println(ch + " is A ALPHABET ");

            } else if (ch >= '0' && ch <= '9') {

                System.out.println(ch + " is A NUMBER ");

            } else {

                System.out.println(ch + " is A SPECIAL CHARACTER ");
            }

        }
    }





