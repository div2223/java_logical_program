import java.util.Scanner;

public class Perfect2 {

    
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

               System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        System.out.println("Perfect numbers between 1 and " + n + " are:");

                for (int i = 1; i <= n; i++) {
                        if (isPerfect(i)) {
                System.out.println(i);
            }
        }

        
        scanner.close();
    }
}
