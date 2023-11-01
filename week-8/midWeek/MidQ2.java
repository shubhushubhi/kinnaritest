package midWeek;

import java.util.Scanner;

/*2. Print multiplication table of 24, 50 and 29 using loop.
*/
public class MidQ2 {

    public static void main(String[] args) {
        {
            Scanner number = new Scanner(System.in);
            System.out.print("Enter number:");
            int n = number.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
    }
}





