
/*1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won. */
import java.util.Scanner;
import java.util.Random;

class Game {
    public int ComputerInput, UserGuess, no_of_guess = 0;

    public Game() {
        Random random = new Random();
        ComputerInput = random.nextInt(15);
    }

    public void UserInput(int num) {
        UserGuess = num;
    }

    public boolean IsCorrectNumber() {
        if (UserGuess > ComputerInput) {
            System.out.println("You have chosen Bigger No");
            no_of_guess = no_of_guess + 1;
            return false;
        } else if (UserGuess < ComputerInput) {
            System.out.println("You have Chosen Smaller number");
            no_of_guess = no_of_guess + 1;
            return false;
        } else {
            System.out.println("Your Guess is Correct");
            no_of_guess = no_of_guess + 1;
            System.out.println("Number of Guess required : " + no_of_guess);
            return true;
        }
    }
}

public class Number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GUESS THE NUMBER GAME ! ");

        Game player = new Game();
            System.out.println("Guess the Number from 0 to 15 : ");
            player.UserInput(sc.nextInt());

            while (!player.IsCorrectNumber())
             {
                System.out.println("Guess the Number Again");
                player.UserInput(sc.nextInt());
            }

    }
}