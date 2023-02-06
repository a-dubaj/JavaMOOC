
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;
        int difference = first - second;
        int multiplication = first * second;
        double division = 1.0 * first / second;

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + difference);
        System.out.println(first + " * " + second + " = " + multiplication);
        System.out.println(first + " / " + second + " = " + division);
    }
}
