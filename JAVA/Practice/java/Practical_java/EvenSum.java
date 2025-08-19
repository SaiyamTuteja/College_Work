
import java.util.*;

class SumOfDigit {

    public void SumOfDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = sc.nextInt();

        int sum = 0, lastDigit = 0;
        while (n1 > 0) {
            lastDigit = n1 % 10;
            if (lastDigit % 2 == 0) {

                sum += lastDigit;
            }

            n1 /= 10;

        }
        if (sum == 0) {
            System.out.println("NO EVEN DIGIT");

        } else {
            System.out.println("Sum of Even digits is " + sum);
        }

    }
}

class TestEven {

    public static void main(String[] args) {
        new SumOfDigit().SumOfDigits();
    }
}
