import java.util.Random;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        // Created two variables an answer which the computer will pick a random number from 1-50 and a guess
        // which the user will guess.
        int answer, guess;
        final int MAX = 50;
        int guesses = 0;


        // Create two objects
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        answer = rand.nextInt(MAX) + 1;
        System.out.print("Guess a number between 1 and 50: ");
        guess = keyboard.nextInt();
        guesses++;

        while (guess != answer) {

            if (guess > answer) {
                System.out.println("Your guess is higher than the answer");
            }
            else {
                System.out.println("Your guess is lower than the answer");
            }
            System.out.println("Guess again: ");
            guess = keyboard.nextInt();
            guesses++;

            }
            System.out.println("You got the answer! " + "You got it in " + guesses + " guesses");


        }




}
