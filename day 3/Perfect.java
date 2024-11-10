import java.util.Scanner;

public class Perfect{

        public static boolean isPerfect(int number) {
               if (number <= 0) {
            return false;
        }

        int sumOfDivisors = 0;

        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {  // If i is a divisor of number
                sumOfDivisors += i;
            }
        }

               return sumOfDivisors == number;
    }

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

               System.out.print("Enter a number: ");
        int number = scanner.nextInt();

                if (isPerfect(number)) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }

                scanner.close();
    }
}
