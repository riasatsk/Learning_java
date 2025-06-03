
import java.util.Scanner;

public class Random {
    public static void game(int guess, int random, Scanner scanner) {
        if (guess == random) {
            System.out.println("You guessed it right pal the random number is " + random);
            scanner.close();

        } else if (guess > random) {
            System.out.println("You have guessed a big number now guess");
            System.out.println("Guess the number again: ");
            guess = scanner.nextInt();
            game(guess, random, scanner);

        } else {
            System.out.println("You guessed a samall number");
            System.out.println("Guess the number again: ");
            guess = scanner.nextInt();
            game(guess, random, scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will choose a number between 1 and 100 you have to guess the number.");
        int random = (int) Math.ceil(Math.random() * 100);
        System.out.println("Guess the number: ");
        int guess = scanner.nextInt();
        game(guess, random, scanner);
    }
}
