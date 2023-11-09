import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(101);

        while(true) {
            System.out.println("Enter a number 1 - 100");
            int guess = input.nextInt();
            if(guess < number) {
                System.out.println("number is too low...");
            } else if(guess > number) {
                System.out.println("number is too high...");
            } else if(guess == number) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
        input.close();
    }
}
