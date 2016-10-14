/**
 * Author: Connor Corbin
 * Student ID: s4908654
 * Date:08/10/2016
 * Task upload 1 Task 1
 * 
 * This program will calculate a 20% increase in salary from an employees current salary.
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SalaryIncrease {

	public static void main(String[] args) {

		BigDecimal currentSalary = new BigDecimal ("10000"); //Current salary.

		BigDecimal newSalary;
		BigDecimal IncreaseInPay = new BigDecimal ("1.2"); //Will increase salary by 20%.


		newSalary = currentSalary.multiply(IncreaseInPay);

		DecimalFormat df = new DecimalFormat("#,###.00"); //Format currency correctly 
		System.out.print("Your old salary was ");
		System.out.print(("£")+(df.format(currentSalary))+("."));
		System.out.print("Your new salary is now ");
		System.out.println(("£")+(df.format(newSalary))+("."));


		
	
	

	}

}
