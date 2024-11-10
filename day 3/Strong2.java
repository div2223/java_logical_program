import java.util.Scanner;

public class Strong2 {

        public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

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

                System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        System.out.println("Strong numbers between 1 and " + n + " are:");

                for (int i = 1; i <= n; i++) {
            
            if (isStrong(i)) {
                System.out.println(i);
            }
        }

                scanner.close();
    }
}
