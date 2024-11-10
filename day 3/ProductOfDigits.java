import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int product = 1;
        int tempNumber = number;

                while (tempNumber != 0) {
            int digit = tempNumber % 10;            
             product *= digit;             
            tempNumber /= 10;             
        }
        
        System.out.println("The product of digits of " + number + " is: " + product);
        
        scanner.close();
    }
}
