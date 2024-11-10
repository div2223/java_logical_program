import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

                int sum = 0;

                for (int i = 1; i <= n; i++) {
            sum += i;
        }

        
        System.out.println("The sum of all natural numbers from 1 to " + n + " is: " + sum);

        sc.close();
    }
}
