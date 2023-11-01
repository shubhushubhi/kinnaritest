import java.util.Scanner;

/*6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
| Salary Slip |
| |
| |
| Employee Id : 2564 |
| Employee Name : Jay |
|
|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|
|
| Gross Salary : 26750.0 |
|===========================|
*/
public class wk8Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = input.nextInt();
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        double hra = 0.10 * basicSalary;
        double da = 0.08 * basicSalary;
        double ta = 0.09 * basicSalary;
        double pf = 0.20 * basicSalary;

        double grossSalary = basicSalary + hra + ta + da - pf;

        System.out.println("Salary Slip");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);

    }
}



