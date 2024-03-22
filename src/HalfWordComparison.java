import java.util.Scanner;
public class HalfWordComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        int length = word.length();
        int middleIndex = length / 2;
        if (length % 2 != 0) {
            word = word.substring(0, middleIndex) + word.substring(middleIndex + 1);
            length = word.length();
        }
        String firstHalf = word.substring(0, length / 2);
        String secondHalf = word.substring(length / 2);
        if (firstHalf.equals(secondHalf)) {
            System.out.println("First and second half same");
        } else {
            System.out.println("First and second half different");
        }
        scanner.close();
    }
}