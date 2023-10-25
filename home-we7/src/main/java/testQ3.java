public class testQ3{
    // 3. Write a Java programme using the following steps
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the print statement
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.
    String name="Shubhu";
    static String surname= "Adhyaru";
    public void m5(){
        System.out.println(name);
    }
    public static void m6(){
        System.out.println(surname);
    }
    public static void main(String[] args) {

        System.out.println(surname);
        testQ3 k = new testQ3();
        k.m5();
        k.m6();

    }

}
