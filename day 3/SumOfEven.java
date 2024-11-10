import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.println("Enter a positive integer n: ");
        int n = sc.nextInt();

                int sum = 0;

                for (int i = 2; i <= n; i += 2) {  // Start from 2 and increment by 2
            sum += i;
        }

                System.out.println("The sum of all even numbers from 1 to " + n + " is: " + sum);

        sc.close();
    }
}
