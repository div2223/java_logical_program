import java.util.Scanner;

public class Strong {

        public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is a Strong number
    public static boolean isStrong(int number) {
        int originalNumber = number;
        int sum = 0;

        
        while (number != 0) {
                        int digit = number % 10;

                        sum += factorial(digit);

                        number /= 10;
        }

                return sum == originalNumber;
    }

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
        int number = scanner.nextInt();

                if (isStrong(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

                scanner.close();
    }
}
