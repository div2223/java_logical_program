import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8};

        printUniqueElements(array);
    }

    public static void printUniqueElements(int[] array) {
                Map<Integer, Integer> frequencyMap = new HashMap<>();

                for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        System.out.println("Unique elements in the array:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
