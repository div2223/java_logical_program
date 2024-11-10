import java.util.Scanner;

public class Fibonacci{

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

               int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");  // Print the current term
            
                        int nextTerm = first + second;
            first = second;  // Update first to be the second term
            second = nextTerm;  // Update second to be the next term
        }

                scanner.close();
    }
}
