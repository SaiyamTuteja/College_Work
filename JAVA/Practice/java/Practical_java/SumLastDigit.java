
import java.util.*;

class SumOfDigit {

    public SumOfDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter a 2nd  number");
        int n2 = sc.nextInt();
        int sum = 0;
        int lastDigitN1 = n1 % 10;
        int lastDigitN2 = n2 % 10;
        sum = lastDigitN1 + lastDigitN2;
        System.out.println("Sum of digit is " + sum);
    }
}

class Q1 {

    public static void main(String[] args) {
        new SumOfDigit();
    }
}
