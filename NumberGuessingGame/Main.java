import java.util.Scanner;
import java.util.Random;

// Utility class for ANSI color codes
class GameUtils {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String BOLD = "\u001B[1m";
}

// Core game logic in OOP style
class NumberGuessingGame {
    private final int LOWER_BOUND;
    private final int UPPER_BOUND;
    private int targetNumber;
    private int attempts;
    private final Scanner scanner;
    private final Random random;

    public NumberGuessingGame(int lower, int upper) {
        this.LOWER_BOUND = lower;
        this.UPPER_BOUND = upper;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void play() {
        boolean playAgain;
        do {
            resetGame();
            printWelcomeMessage();
            gameLoop();
            playAgain = askToPlayAgain();
        } while (playAgain);
        System.out.println(GameUtils.YELLOW + "\nThanks for playing! See you next time!" + GameUtils.RESET);    }

    public void closeScanner() {
        scanner.close();
    }

    private void resetGame() {
        this.targetNumber = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        this.attempts = 0;
    }

    private void printWelcomeMessage() {
        System.out.println(GameUtils.BOLD + GameUtils.BLUE + "\n Welcome to the Number Guessing Game!" + GameUtils.RESET);
        System.out.println(GameUtils.YELLOW + " I'm thinking of a number between " + LOWER_BOUND + " and " + UPPER_BOUND + "." + GameUtils.RESET);
    }

    private void gameLoop() {
        while (true) {
            int guess = getUserGuess();
            attempts++;

            if (guess > targetNumber) {
                System.out.println(GameUtils.RED + " Too high! Try again." + GameUtils.RESET);
            } else if (guess < targetNumber) {
                System.out.println(GameUtils.RED + " Too low! Try again." + GameUtils.RESET);
            } else {
                System.out.println(GameUtils.GREEN + " Congratulations! You guessed it in " + attempts + " attempts!" + GameUtils.RESET);
                break;
            }
        }
    }

    private int getUserGuess() {
        while (true) {
            System.out.print(GameUtils.GREEN + " Enter your guess: " + GameUtils.RESET);
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                if (guess >= LOWER_BOUND && guess <= UPPER_BOUND) {
                    return guess;
                } else {
                    System.out.println(GameUtils.RED + " Please enter a number between " + LOWER_BOUND + " and " + UPPER_BOUND + "." + GameUtils.RESET);
                }
            } else {
                System.out.println(GameUtils.RED + " Invalid input! Please enter a valid number." + GameUtils.RESET);
                scanner.next(); // discard invalid input
            }
        }
    }

    private boolean askToPlayAgain() {
        System.out.print(GameUtils.BLUE + "\n Do you want to play again? (yes/no): " + GameUtils.RESET);
        String response = scanner.next().trim().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
}

// Entry point of the program
public class Main {
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame(1, 100);
        game.play();
        game.closeScanner(); // Ensure scanner is closed
    }
}
