
import java.util.Random;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        int i = 1;

        System.out.println("Welcome to the guessing game!");
        System.out.println("A random number between 1 and 100 will be generated. You have to try and guess which number it is. After each guess, you will receive a hint.");
        System.out.println("Write your first guess");

        while(i<=5){
            Scanner reader = new Scanner(System.in);

            if(reader.hasNextInt()) {
                int guess = reader.nextInt();
                if(guess == randomNumber){
                    System.out.println("Congratulations, you guessed the correct number!");
                }

                else if(guess < randomNumber){
                    System.out.println("No, this is not the right number. Hint: guess higher.");
                    System.out.println("Write your next guess");
                }

                else if(guess > randomNumber){
                    System.out.println("No, this is not the right number. Hint: guess lower.");
                    System.out.println("Write your next guess");
                }
            }

            else {
                String endGame = reader.next();
                if (endGame.equals("quit")) {
                    System.out.println("You quit the game.");
                    System.exit(0);

                }
            }

            int attemptsLeft = 5 - i;

            System.out.println("You have " + attemptsLeft + " attempts left" );
            if(attemptsLeft == 0){
                System.out.println("Game Over");
            }

            i++;


            }
        }
    }
