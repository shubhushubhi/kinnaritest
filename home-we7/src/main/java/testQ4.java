public class testQ4 {
    //4. Write a Java programme using the following steps.
    //4.1 Declare two instance and two static variables.
    //4.2 Declare one instance method.
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.
    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.
 String name = "Raman";// instance variables
    int x=2;           // instance variables

    static String name2 ="Radha"; // static variables
    static String name3 ="Rishi"; // static variables

    public void  m5(){// instance method
        System.out.println(x);
        System.out.println(name);
    }
    public static void m6() { // static method
        System.out.println(name2);
    }

    public static void main(String[]args) {
    //classname k = new Classname(); for object creation
        testQ4 k = new testQ4();
        k.m5();
        k.m6();
        System.out.println(name2);
    }

    }


