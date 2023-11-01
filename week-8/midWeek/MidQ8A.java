package midWeek;
/*8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */
public class MidQ8A {
    public static void main(String[] args) {
        int classheld = 100;
        int classeatt = 70;

        double attendance = (double) classeatt /classheld * 100;

        System.out.println("Percentage of classes attended: " + attendance + "%");

        if (attendance >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam due to low attendance.");
        }
    }
}





