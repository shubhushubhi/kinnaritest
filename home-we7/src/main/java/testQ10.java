public class testQ10 {
    //10. Write a Java program that takes a number as input and prints its multiplication table up to 10.
    //Test Data: Input a number: 8.
    //Expected Output:
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 10 = 80

    public static void main(String[] args){
        int a = 8;// number n for which we have to print the multiplication table.
        for (int i = 1; i <= 10; i++) {
            // looping from 1 to 10 to print the multiplication table of the number.
            // using for loop
            //printing the a*i,ie ith multiple of a.

            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}