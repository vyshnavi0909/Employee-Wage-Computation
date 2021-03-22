import java.util.*;

public class empWage {

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		int wagePerHr = 20;
		int fullTimeHrs = 8;
		int partTimeHrs = 4;
		int dailyWage = 0;
		Random check = new Random();
		int empCheck = check.nextInt(3);
		switch(empCheck) {
		case 0:
				System.out.println("Employee is absent");
				break;
		case 1:
				dailyWage = wagePerHr * partTimeHrs;
            System.out.println( dailyWage + " is the employees part time wage per day");
				break;
		case 2:
				dailyWage = wagePerHr * fullTimeHrs;
				System.out.println( dailyWage + " is the employees full time wage per day");
				break;
		default:
				System.out.println("invalid");
				break;
		}
	}
}
