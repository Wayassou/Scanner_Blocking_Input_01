import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = 0;
        boolean validInput;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // clear the invalid input
                validInput = false;
            }
        } while (!validInput);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
