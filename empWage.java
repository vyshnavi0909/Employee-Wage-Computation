import java.util.*;

public class empWage {

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		int wagePerHr = 20;
		int fullTimeHrs = 8;
		int partTimeHrs = 4;
		int totalWorkingDays = 20;
		int totalWorkingHrs = 100;
		int workingHrs = 0;
		int dailyWage = 0;
		for( int day = 1; day<= totalWorkingDays; day++){
			if(workingHrs < totalWorkingHrs){
				Random check = new Random();
				int empCheck = check.nextInt(3);
				switch(empCheck) {
					case 0:
						System.out.println("Day " + day +" Employee is absent");
						break;
					case 1:
						workingHrs += partTimeHrs;
						dailyWage = ( wagePerHr * partTimeHrs );
						System.out.println("Day " + day + " Employee is present for part time and wage is " + dailyWage);
						break;
					case 2:
						workingHrs += fullTimeHrs;
						dailyWage = ( wagePerHr * fullTimeHrs );
						System.out.println("Day " + day + " Employee is present for full time and wage is " + dailyWage);
						break;
					default:
						System.out.println("invalid");
						break;
				}
			}
		}
	}
}
