import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{

        System.out.print("Enter an integer: ");

        int userInput = scanner.nextInt();


        double squareRoot = Math.sqrt(userInput);

        System.out.println("Square root of " + userInput + " is " + squareRoot);
        } catch(InputMismatchException e){
            System.out.println("Please make sure you enter an integer");
        }
        scanner.close();
        
    }
}
