import java.util.Scanner;

public class Natural {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int i = 1;

       
        System.out.println("Natural numbers from 1 to " + n + ":");
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
}
}
  