import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class hj {

    public static void formality() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi!");
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("What a nice name you've got.");
        System.out.println("May i ask How old you are?");
        int age = 0;
        do {
                try {
                    age = scanner.nextInt();
                }
                catch (InputMismatchException e){}
                finally {scanner.nextLine();}
                System.out.println("Age must be a number");
            } while (age == 0);


        if  (age >= 90) {
            System.out.println("STOP THE CAP!");
            System.out.println("How old are you!");
            age = scanner.nextInt();
        }
        else if (age <= 10){
            System.out.println("GROW UP!");
            System.out.println("How old are you!");
            age = scanner.nextInt();
        }

        System.out.println("Oh, so you're " + age + " years old.");
        System.out.println("Good to know.");
        System.out.println("What are your hobby's?");
        String hobby = scanner.nextLine();
        System.out.println("oh so you like " + hobby + " that's interesting.");
        System.out.println("Do you wanna play a game?");
        System.out.println("It's really simple.");
        }

    public static void game() {
        Scanner player = new Scanner(System.in);
        System.out.println("Just guess a number between 1 and 100");
        int guess = player.nextInt();
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
                System.out.println("number is " + NUMBER);
                System.out.println("That's right!");
                System.out.println("Congratulations, You won absolutely nothing and wasted your time.");
                System.exit(0);
            }
        }
    }



    private static final Random Random = new Random();
    private static final int NUMBER = Random.nextInt(100) + 1;

    public static void main(String[] args) {
        formality();
        game();

    }
}
