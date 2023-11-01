/*
21. Write a Java program to sum values of an array.
 */
public class wk8Q21 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// Declare and initialize an integer array.

        int sum = 0; // Declare and initialize a variable to store the sum.

        for (int i : array) // Add each element to the sum.
            sum += i;

        System.out.println("The sum is " + sum); // Print the sum of the array elements.
    }
}

