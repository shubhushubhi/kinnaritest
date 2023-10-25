public class testQ20 { // 20. Write a Java Program using below steps.
    // 20.1 Declare your Spain as static variable
    // 20.2 Declare your United Kingdom as instance variable.
//20.3 Declare instance method name homeCountry()and call static variable.
//20.4 Declare static method name holidays() and call instance variable
//20.5 Call both methods in main method.

    static String name = "Spain";  //static variables.
    String name1 = "United Kingdom"; // instance variables.
    public void homecountry() {
        System.out.println(name);
    }
    public static void holidays() {
            testQ20 k = new testQ20();         // creat object (class name k = new class name();)
            System.out.println(k.name1);
        }
        public static void main(String[] args) { //main method

        holidays();
            testQ20 k = new testQ20();   // object.static method();
            k.homecountry();             //object.instance method();

        }
    }

