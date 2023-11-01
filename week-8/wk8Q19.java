import java.util.Scanner;

/*19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
*/
public class wk8Q19 {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = a.nextInt();

        if (n > 0)
        {
            System.out.println("Number is positive");
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }

}
