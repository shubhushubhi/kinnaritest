package midWeek;

import java.util.Scanner;
/*1. Take 10 integers from keyboard using loop and print their average value on the
screen.
 */
public class MidQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int total = 0;

         for (int i = 1; i <=10; i++ );
         int num = sc.nextInt();

         total += num;
         double average = (double) total/10;
        System.out.println("Average of the 10 integers" + average);
    }
}



