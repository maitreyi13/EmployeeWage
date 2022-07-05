import java.lang.Math;
public class EmployeeWage {
    public static void main(String[] args){
    
        double a = Math.floor(Math.random() * 10) % 3;

        if(a == 0){
            System.out.println("Employee is Present");
        }else if( a == 1) {
            System.out.println("Employee is Absent");
        }else
            System.out.println("Employee is present for the Half day");

    }
}
