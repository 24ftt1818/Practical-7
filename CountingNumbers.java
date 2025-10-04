import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        int total = 0;
        int num;
        int pos = 0;
        int neg = 0;
        int count = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");

        while (true) {
            num = input.nextInt();
            if (num == 0) {
                break;
                
            }
            if (num > 0){
                pos++;

            }
            else neg++;

            total += num;
            count++;
            
        }
        if (count == 0) {
            System.out.println("No number is entered except for 0 to end the program.");
            
        }
        else {
            double avg = (double) total / count;
            System.out.println("The number of positive is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + total);
            System.out.println("The average " + avg);

            System.out.println("");

        }
    }
    
}
