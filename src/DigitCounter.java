import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 0) {
            number *= -1;
        }
        int digitCount = 0;
        while (number != 0) {
            number /= 10;
            digitCount++;
        }
       // System.out.println("The number has " + digitCount + " digits.");
        System.out.printf("The number has %d digits.",digitCount);
    }
}
