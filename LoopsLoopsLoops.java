import java.util.Scanner;

public class LoopsLoopsLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        System.out.println("Below is generated using while loop: ");
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        System.out.println("Below is generated using dowhile loop: ");
        int j = 50;
        do {
            System.out.print(j + " ");
            j--;
            
        } while (j >= 35);
        System.out.println("\n");

        System.out.println("Below is generated using for loop: ");
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            System.out.print(alphabet + " ");
            
        }
        System.out.println("\n");
    }
    
}
