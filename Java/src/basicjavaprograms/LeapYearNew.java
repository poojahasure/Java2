package basicjavaprograms;

import java.util.Scanner;

//To check for a leap year in Java, 
//a year must satisfy one of two conditions: it must be divisible by 400, or it must be divisible by 4 but not by 100.
public class LeapYearNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year logic
        if ((year % 400 == 0) || (year % 4 == 0 &&year % 100 != 0 )) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
