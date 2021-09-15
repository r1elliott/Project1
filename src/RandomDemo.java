import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        var randomNumberPicker = new Random();
        var randomNumber = randomNumberPicker.nextInt(10) + 1;
        var inputReader = new Scanner(System.in);
        System.out.print("pick a random number from 1 to 10:");
        var usersNumber = inputReader.nextInt();
        while (true) {
            if (randomNumber == usersNumber) {
                System.out.println("You were right the number was " + randomNumber);
                break;
            } else {
                if (usersNumber > randomNumber)
                    System.out.println("Unfortunately " + usersNumber + " was too high");
                else
                    System.out.println("Unfortunately " + usersNumber + "was too low");
                System.out.print("Try again");
                usersNumber = inputReader.nextInt();
            }

        }
    }
}
