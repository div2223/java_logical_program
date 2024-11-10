public class ASCII {
    public static void main(String[] args) {
        System.out.println("ASCII Character Table:");
        System.out.println("----------------------");
       for (int i = 0; i <= 127; i++) {
                        System.out.printf("ASCII value %3d : %c%n", i, (char) i);
        }
    }
}
