import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
