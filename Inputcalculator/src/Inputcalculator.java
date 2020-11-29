import java.util.Scanner;

class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        double count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number: ");

            boolean isNextInt = scanner.hasNextInt();
            if (isNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;


            } else {

                //System.out.println("SUM = 0 AVG = 0");
                break;
            }
            scanner.nextLine();


        }
        System.out.println("SUM =  " + sum + " AVG = " + Math.round((float)(sum / count)));
        scanner.close();
    }
}

