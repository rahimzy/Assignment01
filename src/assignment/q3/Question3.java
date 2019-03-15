package assignment.q3;

import java.util.Scanner;

/**
 * 
 * @author Breshna Rahimzy/991487145
 *  replacing a letter by another letter in a
 *         String.
 *
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = k.nextLine();

		System.out.println("Enter a character to replace:  ");
		String character1 = k.nextLine();

		System.out.println("Enter a character to replace it with: ");
		String character2 = k.nextLine();

		System.out.println(sentence.replaceAll(character1, character2));

	}

}
