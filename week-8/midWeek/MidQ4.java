package midWeek;

import java.util.Scanner;

/*4. Take values of length and breadth of a rectangle from user and check if it is square or not.
*/
public class MidQ4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter Length");
        int l = in.nextInt();
        System.out.print("Enter Breath");
        int b = in.nextInt();




        if (l==b) {
            System.out.println ("Square");
        } else {
            System.out.println ("Not Square");

        }
    }

}
