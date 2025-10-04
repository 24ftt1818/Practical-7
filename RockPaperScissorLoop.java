import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        String choice;
        int rounds = 0;
        int yourScore = 0;
        int compScore = 0;

        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int pick = input.nextInt();

            int randomNumGen = (int) (Math.random() * 3);

            rounds++;

            if (randomNumGen == 0 && pick == 0){
                System.out.println("The computer is rock. You are rock. It is draw.");
            }
            if (randomNumGen == 0 && pick == 1){
                System.out.println("The computer is rock. You are paper. You win.");
                yourScore++;
            }
            if (randomNumGen == 0 && pick == 2){
                System.out.println("The computer is rock. You are scissor. You lose.");
                compScore++;
            }
            if (randomNumGen == 1 && pick == 0){
                System.out.println("The computer is paper. You are rock. You lose.");
                compScore++;
            }
            if (randomNumGen == 1 && pick == 1){
                System.out.println("The computer is paper. You are paper. It is draw.");
            }
            if (randomNumGen == 1 && pick == 2){
                System.out.println("The computer is paper. You are scissor. You win.");
                yourScore++;
            }
            if (randomNumGen == 2 && pick == 0){
                System.out.println("The computer is scissor. You are rock. You win.");
                yourScore++;
            }
            if (randomNumGen == 2 && pick == 1){
                System.out.println("The computer is scissor. You are paper. You lose.");
                compScore++;
            }
            if (randomNumGen == 2 && pick == 2){
                System.out.println("The computer is scissor. You are scissor. It is draw.");
            }

            System.out.print("\nEnter y to play again: ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("\nIn the total of " + rounds + " round(s), you scored " + yourScore +
                           ", Computer scored " + compScore + ".");

        if (yourScore > compScore) {
            System.out.println("You win the game!");

        } else if (yourScore < compScore) {
            System.out.println("You lose the game!");

        } else {
            System.out.println("The game is a draw!");

        }
        System.out.println("");
    }
}
