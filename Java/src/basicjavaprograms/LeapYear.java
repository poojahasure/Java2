package basicjavaprograms;

import java.util.Scanner;

//Leap year =366 days ,one extra day in feb =29
//leap year is divisible by 4
//A century year is a leap year every 400 years, i.e. for a century year(end with 00) to be a leap year, it must be divisible by 400.
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year=sc.nextInt();
		
		isLeapYear(year);
		

	}
	
	public static void isLeapYear(int year) {
		 boolean is_leap_year = false;

	        // If year is divisible by 4
	        if (year % 4 == 0) {
	            is_leap_year = true;

	            // To identify whether it is a
	            // century year or not
	            if (year % 100 == 0) {
	                // Checking if year is divisible by 400
	                // therefore century leap year
	                if (year % 400 == 0)
	                    is_leap_year = true;
	                else
	                    is_leap_year = false;
	            }
	        }
	        if(is_leap_year==true) {
				System.out.println(year+ " is a leap year");
			}
			else {
				System.out.println(year+ " is not a leap year");
			}

}
}
