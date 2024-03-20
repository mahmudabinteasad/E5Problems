import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();
        scanner.close();
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        if (firstChar == lastChar) {
            System.out.println("First and last letter are same.");
        } else {
            System.out.println("First and last letter are different.");
        }
    }
}
