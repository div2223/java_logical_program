import java.util.Scanner;

public class NumberToWords {
    
       private static final String[] DIGITS_WORDS = {
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

       public static String convertToWords(int number) {
        if (number == 0) {
            return DIGITS_WORDS[0];
        }

        StringBuilder words = new StringBuilder();
        if (number < 0) {
            words.append("Minus ");
            number = -number;
        }

               String numberStr = Integer.toString(number);
        
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            words.append(DIGITS_WORDS[digit]).append(" ");
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter a number: ");
        int number = scanner.nextInt();

                String words = convertToWords(number);
        System.out.println("Number in words: " + words);
    }
}
