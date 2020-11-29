import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        getInput();

    }

    public static void getInput() {

        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int counter = count + 1;
            System.out.println("Enter number #" + counter + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();
                count++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            scanner.nextLine(); // handle next line character (enter key)
            System.out.println(count);
            System.out.println("The number you entered is: " + number);
            }else{
               System.out.println("Please enter a valid number");
            }

            scanner.nextLine(); // handle end of line (enter key)

        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}

