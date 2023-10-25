/*
//19. Write a Java Program using below steps.
//19.1 Declare one of your group member names as instance variable.
// 19.2 Declare one of your group member names as static variable.
//19.3 Declare one instance method name with group name (e.g. selenium())and call both global variables.
//19.4 Declare static method name agile() and call both variable
//19.5 Call both user defined methods into main method.
    //Note: Declare 1 local variables in all user defined method and main method and print in to statement
 */
public class testQ19 {
    String x =       "Code1"; // group member names as instance variable
    static String b = "Java"; // group member names as static variable

   public void scrum() { //  instance method
       System.out.println(x);
       System.out.println(b);
   }

   public static void agile(){
       testQ19 k = new testQ19();

           System.out.println(b);
   }

  public static void main(String[]args){
      testQ19 k = new testQ19();
       k.scrum();

       }

   }



