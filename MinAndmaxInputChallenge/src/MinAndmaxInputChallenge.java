import javax.lang.model.type.NullType;
import java.util.Scanner;

class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int nextNumber = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                number = nextNumber;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max number is : " + max);
        System.out.println("Min number is : " + min);
        scanner.close();
    }
}