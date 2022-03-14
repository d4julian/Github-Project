import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number to subtract: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number to subtract: ");
        int second = scanner.nextInt();

        System.out.println("Result: " + (first - second));
    }
}
