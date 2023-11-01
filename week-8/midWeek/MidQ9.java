package midWeek;

import java.util.Scanner;
/*9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */
public class MidQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number of classes held");
        int totalClasses = scanner.nextInt();

        System.out.println("number of classes attended");
        int attendedClasses = scanner.nextInt();

       System.out.println("he/she has medical cause or not('Y or N')");
       char Medicalcause = scanner.next().charAt(0);

        double attendance = (double) attendedClasses /totalClasses * 100;

        System.out.println("Percentage of classes attended: " + attendance + "%");

        if (attendance>= 75 || Medicalcause == 'Y' || Medicalcause == 'N'){
            System.out.println("The student is allowed to sit in the exam.");
        }
        else {
            System.out.println("The student is not allowed to sit in the exam due to low attendance.");
        }

    }
}