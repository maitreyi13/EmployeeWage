import java.lang.*;
public class EmployeeWage {

        public static void main(String[] args) {
            int attpart = 1;
            int attfull = 2;
            int wph = 20;
            int emphrs ,empwage ;
            double a = Math.floor(Math.random() * 10) % 3;
            if (a == attpart)
                emphrs = 4;
            else if (a == attfull)
                emphrs = 8;
            else
                emphrs = 0;

            empwage = emphrs * wph;
            System.out.println("Daily wage for an employee : "+empwage);
        }
}