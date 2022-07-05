public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem ");
        System.out.println("**************************************");
        System.out.println("\n Infosys Employee Data \n ");
        EmployeeWage Infy = new EmployeeWage();
        Infy.EmpWage(20,8,4,20,100);
        System.out.println("**********************************************\n");

        System.out.println("\nWipro Employee Data\n");
        EmployeeWage Wipro = new EmployeeWage();
        Wipro.EmpWage(25,10,5,28,140);
        System.out.println("*********************************************** \n");

        System.out.println("\n TCS Employee Data ");
        EmployeeWage TCS = new EmployeeWage();
        TCS.EmpWage(28,12,6,25,180);
        System.out.println("********************************************");

    }
}
