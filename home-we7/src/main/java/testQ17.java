public class testQ17 {//17. Write a Java Program using below steps.
//17.1 Declare your city as instance variables
// 17.2 Declare your country as static variables.
//17.3 Declare one instance method and call static variable in print statement
//17.4 Declare static method and call instance variable in print Statement.
//17.5 Call both user defined methods into main method

    String city = "Gujrat";//instance variables
    static String countryname = "India";// static variables
 public void m5(){ // instance method
   System.out.println("India");} // static variable

   public static void m6() { //static method
     System.out.println("Gujrat"); }// instance variable

    public static void main(String[]args) {
    testQ17 k = new testQ17 (); // create object
        k.m5();
        k.m6();
        System.out.println(k.city);




 }


}
