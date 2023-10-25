public class testQ1 {
    //1. Write a Java programme using the following steps.
    //1.1 Declare two instance variables.
    String name = "kinnari";
    String surname = "bhatt";

    //1.2 Declare one instance method.
    //1.3 Call both instance variables into the instance method inside the print statement.
    public void m5(){
        System.out.println(name);
        System.out.println(surname);
    }
    //1.4 Declare the Main method.
    public static void main(String[]args) {


        //1.5 Call the above instance method into the Main method and run the programme.
        //instant variable obj = new instant variable object ()
        testQ1 k = new testQ1(); // object create
        k.m5();
    }


}



