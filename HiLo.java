import java.util.Random;
import java.util.Scanner;

public class HiLo {
	public static int NUMBER_OF_GUESSES = 4;
	public static int MAX_CARD_NUMBER = 13;
	public static int MAX_NUMBER = 10;
	public static int JACK = 11;
	public static int QUEEN = 12;
	public static int KING = 13;
	public static int ACE = 14;

	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);
		int correctGuesses = 0;
		Random generator = new Random(0);
		int currentCard = generator.nextInt(MAX_CARD_NUMBER);
		currentCard++;
		int guessCount = 0;
		while (guessCount <= NUMBER_OF_GUESSES) {

			if (currentCard <= MAX_NUMBER) {
				System.out.println("The card is a " + (currentCard + 1));
			} else if (currentCard == JACK) {
				System.out.println("The card is a Jack");
			} else if (currentCard == QUEEN) {
				System.out.println("The card is a Queen");
			} else if (currentCard == KING) {
				System.out.println("The card is a King");
			} else {
				System.out.println("The card is an Ace");
			}

			if (guessCount < NUMBER_OF_GUESSES) {

				System.out.print("Do you think the next card will be higher, lower or equal? ");
				boolean inputValid = false;
				int previousCard = currentCard;
				boolean guessedCorrectly = false;
				currentCard = generator.nextInt(MAX_CARD_NUMBER);
				currentCard++;
				while (!inputValid) {
					String userInput = userInputScanner.next();
					inputValid = true;
					if (userInput.equals("higher")) {
						if (previousCard < currentCard)
							guessedCorrectly = true;
					} else if (userInput.equals("lower")) {
						if (previousCard > currentCard)
							guessedCorrectly = true;
					} else if (userInput.equals("equal")) {
						if (previousCard == currentCard)
							guessedCorrectly = true;
					} else {
						inputValid = false;
						System.out.print("You must guess if the next card will be higher, lower or equal. ");
					}
				}

				if (guessedCorrectly) {
					System.out.print("You guessed correctly. ");
					correctGuesses++;
				} else {
					System.out.print("You guessed incorrectly. ");
				}
			}
			guessCount++;
		}

		userInputScanner.close();

		if (correctGuesses == NUMBER_OF_GUESSES) {
			System.out.print("Congratulations, you got them all correct! ");
		} else {
			System.out.print("So close! You almost got it. ");
		}

		System.out.println("You got " + correctGuesses + " out of " + NUMBER_OF_GUESSES + " correct.");
	}
}

// Semi-Working version backup in case I make a balls of the above code.
/*
 * import java.util.Random; import java.util.Scanner;
 * 
 * public class HiLo { public static int NUMBER_OF_GUESSES = 4; public static
 * int MAX_CARD_NUMBER = 13; public static int MAX_NUMBER = 10; public static
 * int JACK = 9; public static int QUEEN = 10; public static int KING = 11;
 * public static int ACE = 12;
 * 
 * public static void main(String[] args) { Scanner userInputScanner = new
 * Scanner(System.in); int correctGuesses = 0; Random generator = new Random(0);
 * //Test value, change before submission int currentCard =
 * generator.nextInt(MAX_CARD_NUMBER); currentCard++; int guessCount = 0; while
 * (guessCount < NUMBER_OF_GUESSES) { guessCount++; // int currentCard =
 * generator.nextInt(MAX_CARD_NUMBER); if (currentCard <= MAX_NUMBER) {
 * System.out.println("The card is a " + currentCard); } else if (currentCard ==
 * JACK) { System.out.println("The card is a Jack"); } else if (currentCard ==
 * QUEEN) { System.out.println("The card is a Queen"); } else if (currentCard ==
 * KING) { System.out.println("The card is a King"); } else {
 * System.out.println("The card is an Ace"); }
 * 
 * System.out.
 * print("Do you think the next card will be higher, lower or equal? ");
 * 
 * // String userInput = userInputScanner.next(); boolean inputValid = false;
 * int previousCard = currentCard; boolean guessedCorrectly = false; currentCard
 * = generator.nextInt(MAX_CARD_NUMBER); currentCard++; while (!inputValid) {
 * String userInput = userInputScanner.next(); inputValid = true; if
 * (userInput.equals("higher")) { if (previousCard < currentCard)
 * guessedCorrectly = true; } else if (userInput.equals("lower")) { if
 * (previousCard > currentCard) guessedCorrectly = true; } else if
 * (userInput.equals("equal")) { if (previousCard == currentCard)
 * guessedCorrectly = true; } else { inputValid = false; System.out.
 * print("You must guess if the next card will be higher, lower or equal. "); }
 * }
 * 
 * if (guessedCorrectly) { System.out.print("You guessed correctly. ");
 * correctGuesses++; } else { System.out.print("You guessed incorrectly. "); } }
 * if (currentCard <= MAX_NUMBER) { System.out.println("The card is a " +
 * currentCard); } else if (currentCard == JACK) {
 * System.out.println("The card is a Jack"); } else if (currentCard == QUEEN) {
 * System.out.println("The card is a Queen"); } else if (currentCard == KING) {
 * System.out.println("The card is a King"); } else {
 * System.out.println("The card is an Ace"); }
 * 
 * if (correctGuesses == NUMBER_OF_GUESSES) {
 * System.out.print("Congratulations, you got them all correct! "); } else {
 * System.out.print("So close! You almost got it. "); }
 * 
 * System.out.println("You got " + correctGuesses + " out of " +
 * NUMBER_OF_GUESSES + " correct."); } }
 */
