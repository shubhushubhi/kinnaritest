import java.util.Scanner;

/*
22. Write a Java program to calculate the average value of array elements.
 */
public class wk8Q22 {
    public static void main(String[] args) {
       int a[] = new int[5];//{10,20,30,40,50}
       int sum = 0;
       double avg;

        Scanner wk8Q22 = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i =0; i<5; i++){
            a[i]= wk8Q22.nextInt();
        }
        for (int i=0; i<5; i++){
        sum = a[i]+sum;
        }
        avg=sum/5.0;
        System.out.println("\n Addition "+sum+"\n Avrage" +avg);






    }
}
