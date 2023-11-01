package midWeek;

import java.util.Scanner;
/*
Take input of age of 3 people by user and determine oldest and youngest among them.
*/
public class midQ7a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 60;
        int youngest = 18;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the age of person " + i + " ");
            int age = scanner.nextInt();

            if (age > oldest) {
                        oldest = age;
                    }
            if (age < youngest) {
                youngest = age;
            }
                    System.out.println("The oldest person is " + oldest + " years old.");
                    System.out.println("The youngest person is " + youngest+ " years old.");

                }
            }
        }


