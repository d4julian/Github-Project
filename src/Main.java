import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number to add: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number to add: ");
        int second = scanner.nextInt();

        System.out.println("Result: " + (first + second));
    }
}
