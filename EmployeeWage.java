import java.lang.*;
public class EmployeeWage {
        public static final int attpart = 1;
        public static final int attfull = 2;

    public void EmpWage(int wph,int empfullhrs, int empparthrs, int wdm, int maxhrs ) {

         int totaldays = 0; int totalhrs = 0;int dailyWages;int MonthlyWages = 0;
            while (totaldays<wdm && totalhrs<=maxhrs ) {
                totaldays++;
                totalhrs++;

                int a = (int) Math.floor(Math.random() * 10) % 3;
                switch (a) {
                    case attfull -> {
                        System.out.println("Day " + totaldays + " Employee is present full day");
                        dailyWages = wph * empfullhrs;
                        System.out.println("Wages of the day " + totaldays + " is " + dailyWages);
                        MonthlyWages = dailyWages + MonthlyWages;
                        maxhrs = maxhrs + empfullhrs;
                    }
                    case attpart -> {
                        System.out.println("Day " + totaldays + " Employee is present half day");
                        dailyWages = wph * empparthrs;
                        System.out.println("Wages of the day " + totaldays + " is " + dailyWages);
                        MonthlyWages = dailyWages + MonthlyWages;
                        maxhrs = maxhrs + empparthrs;
                    }
                    default -> System.out.println("Day " + totaldays + " Employee is Absent");
                }
            }
        System.out.println("Total working hours in the month: " + maxhrs);
        System.out.println("Total employee wages for the month: " + MonthlyWages);
    }
}
