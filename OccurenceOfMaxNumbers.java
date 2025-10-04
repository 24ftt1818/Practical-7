import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        int largest = Integer.MIN_VALUE;
        int count = 0;

        System.out.println("Enter numbers, the input ends with 0 entered: ");

            while (true) {
                int num = input.nextInt();
                if (num == 0)
                break;
                
            
            if (num > largest) {
                largest = num;
                count = 1;
                
            }
            else if (num == largest) {
                count++;

            }
        }
        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers entered. ");
            
        }
        else {
            System.out.println("\nThe largest number is " + largest);
            System.out.println("The occurence count of the largest number is " + count);

            System.out.println("");
        }
        
         
    }
    
}
