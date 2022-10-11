import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void formality() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello human!");
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("What a nice name you've got.");
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if  (age >= 90) {
            System.out.println("ON GOD, STOP THE CAP!");
            System.out.println("How old are you!");
        }else if (age <= 10){
                System.out.println("GROW UP!");
            System.out.println("How old are you!");
        }
        System.out.println("Sorry, How old are you?");
            int age3 = scanner.nextInt();
            System.out.println("Oh, so you're " + age3 + " years old.");
            System.out.println("Good to know.");
            scanner.nextLine();
            System.out.println("What are your hobby's?");
            String hobby = scanner.nextLine();
            System.out.println("oh so you like " + hobby + " that's interesting.");

    }

    public static void game() {
        Scanner player = new Scanner(System.in);

        // prompt player for guess
        System.out.println("Guess a number between 1 and 100");
        guess = player.nextInt();
        while (guess != NUMBER) {
            System.out.println("Guess again");
            guess = player.nextInt();
            if (guess == NUMBER) {
                System.out.println("You got it right!");
            }
            if (guess > NUMBER) {
                System.out.println("Too high");
            } else if (guess < NUMBER) {
                System.out.println("Too low");
            } else {
                System.out.println("number is " + String.valueOf(NUMBER)); //DEBUG
                System.out.println("That's right!");
                System.out.println("Congratulations you won absolutely nothing and wasted your time.");
                System.exit(0);
            }
        }
    }


    private static final Random Random = new Random();
    private static final int NUMBER = Random.nextInt(100) + 1;
    private static int guess = 0;

    public static void main(String[] args) {
    formality();
    game();

    }
}