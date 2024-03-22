import java.util.Scanner;
public class AgainNumberOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'strict' or 'lenient' for increasing/decreasing comparison: ");
        String type = scanner.nextLine();
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (type.equals("strict")) {
            if (num1 < num2 && num2 < num3) {
                System.out.println("Increasing");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else if (type.equals("lenient")) {
            if ((num1 <= num2 && num2 <= num3)) {
                System.out.println("Increasing");
            } else if ((num1 >= num2 && num2 >= num3)) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else {
            System.out.println("Invalid type entered. Please enter 'strict' or 'lenient'.");
        }
        scanner.close();
    }
}