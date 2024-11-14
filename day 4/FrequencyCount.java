import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

                System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

               HashMap<Integer, Integer> frequencyMap = new HashMap<>();

                for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }

        scanner.close();
    }
}
