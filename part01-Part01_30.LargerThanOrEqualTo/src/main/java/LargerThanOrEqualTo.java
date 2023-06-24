import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give te second number: ");
        int second = Integer.valueOf(scan.nextLine());

        if (fist > second) {
            System.out.println("Larger number is: " + first);
        } else if (second > first) {
            System.out.println("Larger number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}