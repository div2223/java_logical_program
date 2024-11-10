import java.util.Scanner;

public class ArmstrongNumbersInRange {

        public static boolean isArmstrong(int number) {
                int originalNumber = number;

               int numberOfDigits = String.valueOf(number).length();

                int sum = 0;

                while (number != 0) {
                        int digit = number % 10;

            
            sum += Math.pow(digit, numberOfDigits);

                       number /= 10;
        }

                return sum == originalNumber;
    }

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + " are:");

                for (int i = 1; i <= n; i++) {
                        if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
