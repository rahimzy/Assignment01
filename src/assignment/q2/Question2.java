package assignment.q2;

import java.util.Scanner;

/**
 * 
 * @author USER
 * 
 *         the program accepts a String then returns the reversed version of the
 *         String.
 * 
 *
 */
public class Question2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String reverse = k.nextLine();

		String result = reverse(reverse);

		System.out.println(result);
	}

	/**
	 * 
	 * @param inputString
	 * @return reverse String
	 */
	private static String reverse(String inputString) {
		String reverseString = "";

		String[] arr = inputString.split(" ");

		for (int sub = arr.length - 1; sub >= 0; sub--) {
			reverseString += arr[sub] + " ";
		}

		return reverseString;
	}

}
