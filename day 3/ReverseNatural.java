import java.util.Scanner;

public class ReverseNatural{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Natural numbers in reverse order:");
        int i = n;
        while (i >= 1) {
            System.out.println(i + " ");
            i--;
        }
        
        sc.close();
    }
}
