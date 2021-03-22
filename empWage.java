import java.util.*;

public class empWage {

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		int wagePerHr = 20;
		int fullDayHrs = 8;
		Random check = new Random();
		int empCheck = check.nextInt(2);
		if(empCheck == 1){
			int dailyWage = wagePerHr * fullDayHrs;
			System.out.println( dailyWage + " is the employees wage per day");
		}else{
			System.out.println("Employee is Absent");
		}
	}
}
