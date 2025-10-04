import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        System.out.print("please enter the term: ");
        int term = input.nextInt();

        int fTerm0 = 0;
        int fTerm1 = 1;
        int fTerm2 = 0;

        if (term == 0) {
            System.out.println("F0 is " + fTerm0);
            
        }
        else if (term == 1) {
            System.out.println("F1 is " + fTerm1);

        }
        else {
            for (int i = 2; i <= term; i++) {
                fTerm2 = fTerm0 + fTerm1;
                fTerm0 = fTerm1;
                fTerm1 = fTerm2;
                
            }
            System.out.println("At term " + term + " is " + fTerm2);
            System.out.println("");
        }
    }
    
}
