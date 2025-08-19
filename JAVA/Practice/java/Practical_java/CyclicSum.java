
import java.util.Scanner;

class CyclicSum {

    public void CyclicSums() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no:");
        int n = sc.nextInt();
        int lastDigit = 0;
        int sum = 0;
        int totalSum = 0; // Initialize total sum
        int digitCount = 0; // Count of digits for cyclic sums

        // First, calculate the sum of digits
        while (n > 0) {
            lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
            digitCount++;
        }

        // Calculate the total sum of cyclic sums
        for (int i = 0; i < digitCount; i++) {
            totalSum += sum * (digitCount - i);
            sum -= lastDigit; // Remove the last digit from the sum
        }

        System.out.println("Total Sum of Cyclic Sums is: " + totalSum); // Output the result

    }
}

class TestCyclics {

    public static void main(String[] args) {
        new CyclicSum().CyclicSums();
    }
}
