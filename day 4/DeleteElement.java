import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the position of the element to delete (0-based index): ");
        int position = scanner.nextInt();

       
        if (position < 0 || position >= size) {
            System.out.println("Invalid position!");
        } else {
           
            for (int i = position; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

           
            System.out.println("Array after deletion:");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }
        
        scanner.close();
    }
}
