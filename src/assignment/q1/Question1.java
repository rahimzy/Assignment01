package assignment.q1;

import java.util.Scanner;
/**
 * 
 * @author Breshna Rahimzy/991487145
 * 
 * Create the program to printout weekdays from 1-7.
 *
 */
public class Question1 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int day = 0;
		do {
			System.out.println("Enter a day (1 to 7): ");

			day = k.nextInt();

			switch (day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			case -1:
				break;
			default:
				System.out.println("Invalid Day");

			}
		} while (day != -1);
		System.out.println("End");

	}

}

