public class Odd {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 and 100 are:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
