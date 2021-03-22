import java.util.*;

public class empWage {

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		Random check = new Random();
		int empCheck = check.nextInt(2);
		if(empCheck == 1){
			System.out.println("Employee Present");
		}else{
			System.out.println("Employee Absent");
		}
	}
}
