import java.util.*;

public class empWage {

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		int wagePerHr = 20;
		int fullTimeHrs = 8;
		int partTimeHrs = 4;
		Random check = new Random();
		int empCheck = check.nextInt(3);
		System.out.println(empCheck);
		if(empCheck == 2){
			int dailyWage = wagePerHr * fullTimeHrs;
			System.out.println( dailyWage + " is the employees full time wage per day");
		}else {
			if(empCheck == 1){
				int dailyWage = wagePerHr * partTimeHrs;
				System.out.println( dailyWage + " is the employees part time wage per day");
			}else{
			System.out.println("Employee is Absent");
			}
		}
	}
}
