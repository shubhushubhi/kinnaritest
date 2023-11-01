package midWeek;

import java.util.Scanner;
/*Take input of age of 3 people by user and determine oldest and youngest among
them.
 */
public class MidQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" age of the first person: ");
        int a1 = scanner.nextInt();

        System.out.println("age of the second person: ");
        int a2 = scanner.nextInt();

        System.out.println(" age of the third person: ");
        int a3 = scanner.nextInt();

        int oldest =   a1;
        int youngest = a1;

        if (a2 > oldest) {
            oldest = a2;
        } else if (a2 < youngest) {
            youngest = a2;
        }

        if (a3 > oldest) {
            oldest = a3;
        } else if (a3 < youngest) {
            youngest = a3;
        }

        System.out.println("The oldest person is " + oldest + " years old.");
        System.out.println("The youngest person is " + youngest + " years old.");


    }
}

