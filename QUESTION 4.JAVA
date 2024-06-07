import java.util.Random;
import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        // Generate random numbers
        Random random = new Random();
        int number1 = random.nextInt(10); // 0 to 9
        int number2 = random.nextInt(10);

        // Ensure number1 is greater than or equal to number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = scanner.nextInt();

        // Check the answer
        if (answer == number1 - number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The answer is " + (number1 - number2));
        }

        scanner.close();
    }
}
