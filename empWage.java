import java.util.*;

public class empWage {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_TIME_HRS = 8;
	public static final int PART_TIME_HRS = 4;
	public static final int ABSENT_HRS = 0; 
	public static final int TOTAL_WORKING_DAYS = 20;
	public static final int TOTAL_WORKING_HRS = 100;
	static int workingHrs = 0;

	static void computingWages(){
		
		for( int day = 1; day<= TOTAL_WORKING_DAYS; day++){
			if(workingHrs < TOTAL_WORKING_HRS){
				Random check = new Random();
				int empCheck = check.nextInt(3);
				switch(empCheck) {
					case 0:
						workingHrs += ABSENT_HRS;
						break;
					case 1:
						workingHrs += PART_TIME_HRS;
						break;
					case 2:
						workingHrs += FULL_TIME_HRS;
						break;
					default:
						System.out.println("invalid");
						break;
				}
			}
		}

	int totalEmpWage = workingHrs * WAGE_PER_HOUR;
		System.out.println("Total wage of the employee is: " + totalEmpWage);
	}
	public static void main(String[] args){
		
		System.out.println("Welcome to Employee Wage Computation");

		computingWages();
	}
	
}
