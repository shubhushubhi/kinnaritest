import java.sql.SQLOutput;

/*
2. Write a java program which remove extra space from both side “ I love
    java ”
    Expected output: “I love java”
 */
public class we7hw2{
    public static void main (String[]args){
        String a = "    I love java   ";
        String b = a.strip();
        System.out.println(b);




    }
}
