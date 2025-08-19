
import java.util.Scanner;

class GeneratePin {

    private int num1, num2, num3;

    public GeneratePin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();
        generatePin();
    }

    public void generatePin() {
        // Extract digits
        int hundreds1 = (num1 / 100) % 10;
        int tens1 = (num1 / 10) % 10;
        int units1 = num1 % 10;

        int hundreds2 = (num2 / 100) % 10;
        int tens2 = (num2 / 10) % 10;
        int units2 = num2 % 10;

        int hundreds3 = (num3 / 100) % 10;
        int tens3 = (num3 / 10) % 10;
        int units3 = num3 % 10;

        // Calculate the positions of the PIN
        int pinOnes = Math.min(Math.min(units1, units2), units3); // Units position
        int pinTens = Math.min(Math.min(tens1, tens2), tens3); // Tens position
        int pinHundreds = Math.min(Math.min(hundreds1, hundreds2), hundreds3); // Hundreds position

        // Calculate the maximum digit for the thousand's position
        int maxDigit = Math.max(Math.max(hundreds1, Math.max(tens1, units1)),
                        Math.max(hundreds2, Math.max(tens2, units2)));
             maxDigit = Math.max(maxDigit, Math.max(hundreds3, Math.max(tens3, units3)));

        // Construct the final PIN
        String finalPin = "" + maxDigit + pinHundreds + pinTens + pinOnes;
        System.out.println("Generated PIN: " + finalPin);
    }
}

class Q4 {

    public static void main(String[] args) {
        new GeneratePin();
    }
}
