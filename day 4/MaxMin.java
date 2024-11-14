import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
                int[] array = new int[n];
        
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        
        int max = array[0];
        int min = array[0];
        
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
        
        scanner.close();
    }
}
