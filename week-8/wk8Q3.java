/*
3. Declare multidimensional array and store 5 countries and their capital and print them in
console.
 */
public class wk8Q3 {

    public static void main(String[] args)
    {
        String[][] Country = {{"Spain ", "India ", "England"}};
        String [][] Capital ={{"Madrid", "New Delhi", " London"}};

        System.out.println(Country[0][0] + Capital[0][0]);
        System.out.println(Country[0][1] + Capital[0][1]);
        System.out.println(Country[0][2] + Capital[0][2]);
        System.out.println(Country.length);
        System.out.println(Capital.length);

    }

    }


