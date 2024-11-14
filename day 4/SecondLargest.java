import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        if (n < 2) {
            System.out.println("Array should contain at least two elements.");
            return;
        }

        
        int[] arr = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

      
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

               if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
        
        scanner.close();
    }
}
