import java.util.Arrays;

/*20. Write a Java program to sort a numeric array and a string array.
*/
public class wk8Q20 {
    // The main method where the program execution starts.
    public static void main(String[] args) {

        int[] array1 = {2, 6, 8, 10, 15, 18};                   // Declare and initialize an integer array.
        String[] array2 = {"Java", "Python", "C++"};      // Declare and initialize a string array.


        // Print the original numeric array.
        System.out.println("Original numeric array : " + Arrays.toString(array1));

        // Print the original string array.
        System.out.println("Original string array : " + Arrays.toString(array2));
    }
}

// /*Sort the numeric array in ascending order.
//        Arrays.sort(array1);
//
//        // Print the sorted numeric array.
//        System.out.println("Sorted numeric array : " + Arrays.toString(array1));
//
//
//        // Sort the string array in lexicographical (alphabetical) order.
//        Arrays.sort(array2);
//
//        // Print the sorted string array.
//        System.out.println("Sorted string array : " + Arrays.toString(array2));
//

