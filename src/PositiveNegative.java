import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(num > 0){
            System.out.printf("Positive.");
        }
        else if(num < 0){
            System.out.printf("Negative.");
        }
        else{
            System.out.printf("Zero.");
        }
    }
}
