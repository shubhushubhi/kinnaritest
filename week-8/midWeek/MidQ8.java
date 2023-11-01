package midWeek;

import java.util.Scanner;

/*8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
public class MidQ8 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("number of classes held: ");
        int totalClasses = num.nextInt();

        System.out.println("number of classes attended: ");
        int attendedClasses = num.nextInt();

        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");


        if (attendancePercentage >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam due to low attendance.");
        }

    }
}
