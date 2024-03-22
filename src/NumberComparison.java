import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 && num1 == num3) {
            System.out.println("All the same");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All different");
        } else {
            System.out.println("Neither");
        }
        scanner.close();
    }
}
