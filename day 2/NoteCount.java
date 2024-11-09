import java.util.Scanner;

public class NoteCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        int totalNotes = 0;

        System.out.println("Number of notes:");
         for (int note : notes) {
            if (amount >= note) {
                int count = amount / note; 
                amount = amount % note;    
                totalNotes += count;
                System.out.println(note + " : " + count);
            }
        }

        System.out.println("Total number of notes: " + totalNotes);
        sc.close();
    }
}
