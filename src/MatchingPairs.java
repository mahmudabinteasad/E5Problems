import java.util.Scanner;

public class MatchingPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if ((num1 == num2 && num3 == num4) || (num1 == num3 && num2 == num4) || (num1 == num4 && num2 == num3)) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }

        scanner.close();
    }
}
