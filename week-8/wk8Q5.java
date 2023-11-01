import java.util.Scanner;

/*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format|
|

Mark Sheet

|
|

|
|
|
Name
Roll No
: 08
: 23
| Subjects : Marks |
| |
| Math : 98 |
| Science: : 90 |
| English : : 85 |
| |
| Total : 273 |
| |
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
 */
public class wk8Q5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name of student");
        String n = in.nextLine();
        System.out.print("Enter class of student");
        int c = in.nextInt();
        System.out.print("Enter roll no of student");
        int r = in.nextInt();

        System.out.print("Enter Maths Subject Marks");
        int m1 = in.nextInt();
        System.out.print("Enter Science Subject Marks");
        int m2 = in.nextInt();
        System.out.print("Enter English Subject Marks");
        int m3 = in.nextInt();

        int t = m1 + m2 + m3;
       float  p= t / 300.0f * 100.0f;

       String g = "";
        if (p >= 80)
            g = "A+";
        else if (p >= 60)
            g = "A";
        else if (p >= 50)
            g = "B";
        else if (p >= 35)
            g = "C";

        else {
            g = "fail";
        }
       System.out.println("Total Marks = " + t);
       System.out.println("Percentage = " + p);
       System.out.println("Grade = " + g);

       System.out.println(" ________________________________________");
        System.out.println("|                                       |");
        System.out.println("|               MARKS SHEET             |");
        System.out.println("|   NAME     "+n+"                      |");
        System.out.println("|   Roll No   "+r+"                     |");
        System.out.println("|   Subject :      marks                |");
        System.out.println("|_______________________________________|");
        System.out.println("|    Maths  :   "+m1+"                  |");
        System.out.println("|    Science:   "+m2+"                  |");
        System.out.println("|    English:   "+m3+"                  |");
        System.out.println("|    Total  :   "+t+"                   |");
        System.out.println("|    percentage:"+p+"                    |");
        System.out.println("|    Result :                           |");
        System.out.println("|    Grade :     "+g+"                  |");



    }
}
