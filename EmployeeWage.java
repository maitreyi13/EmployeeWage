import java.lang.*;
public class EmployeeWage {
        public static final int attpart = 1;
        public static final int attfull = 2;
        public static final int wph = 20;
        public static void main(String[] args) {
            int emphrs ,empwage;
            int a = (int) Math.floor(Math.random() * 10) % 3;
            emphrs = switch (a) {
                case attfull -> 8;
                case attpart -> 4;
                default -> 0;
            };
            empwage = emphrs * wph;
            System.out.println("Daily wage for an employee : "+empwage);
        }
}