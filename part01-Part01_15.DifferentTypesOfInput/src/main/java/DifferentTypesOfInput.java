
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String text = scan.nextLine();

        System.out.println("Give a integer: ");
        int integer = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double: ");
        double floatingPint = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());

        System.out.println("You give the string " + text);
        System.out.println("You give the integer: " + integer);
        System.out.println("Give the double: " + floatingPint);
        System.out.println("You give the boolean " + trueOrFalse);
    }
}
