import java.util.Scanner;

public class Big2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + max);
        
        sc.close();
    }
}
