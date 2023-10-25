public class testQ2{
//2. Write a Java programme using the following steps.
//2.1 Declare two static variables.
//2.2 Declare one static method.
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and run the programme.

    static String name = "shubhi";
    static String city = "London";

    public static void main(String[] args) {
        System.out.println(name); // static to static direct access
        System.out.println(city); // or through class name
    }
}
