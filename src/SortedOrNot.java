import java.util.Scanner;
public class SortedOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
            System.out.println("In order");
        }else {
            System.out.println("Not in order");
        }
        scanner.close();
    }
}