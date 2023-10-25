public class testQ18 { //18. Write a Java Program using below steps.
//18.1 Declare your council name as static variables.
//18.2 Declare your house number as instance variables.
//18.3 Declare one instance method name borough() and call Static variable
//18.4 Declare static method name address() and call instance variable
//18.5 Call both user defined methods into main method.
static String councilname = "Harrow"; //static variables.
String housenumber = "34"; // instance variables.

public void borough(){ // instance method name borough()
    System.out.println("councilname"); // Static variable
}
public static void address(){ // static method name address()
   System.out.println("housenumber");// instance variable
}
  public static void main(String[]args){ //main method
    testQ18 k = new testQ18();     // creat object (class name k = new class name();)
System.out.println(k.councilname); // object.static variables
System.out.println(k.housenumber); //object.instance variables

  }




}
