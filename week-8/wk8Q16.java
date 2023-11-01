import java.util.Scanner;

/*
16. Write a Java program which input any number between 1 to 7 and it print The Days name
MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
number is out of selection Print message “Week contains 1 to 7 days”
 */
public class wk8Q16 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter day");
        int d = s.nextInt();
        printDay(d);
       }
       static void printDay(int day) {
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Wrong day");
        }
    }
}

