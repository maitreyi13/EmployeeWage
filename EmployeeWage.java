public class EmployeeWage {

    public static void main(String[] args) {
        int attendance = (int) Math.floor(Math.random() * 10) % 3;
        if (attendance == 0)
            System.out.println("Employee is absent");
        else if (attendance == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is present for the Half day");
    }
}
