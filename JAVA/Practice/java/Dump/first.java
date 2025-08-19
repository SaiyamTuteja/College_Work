
import java.util.*;

class first {

    public static void AvrageOfNo(int a, int b, int c) {
        int avrage = (a + b + c) / 3;
        System.out.println(avrage);

    }

    public static int sumOfOddNO(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static float largestNo(float a, float b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static float circumfranceOfCircle(float radius) {
        float circumfrance = 2 * 3.14f * radius;
        return circumfrance;
    }

    public static void isVote(int age) {
        if (age >= 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you can't vote");
        }
    }

    public static void doWhile() {
        do {
            System.out.println("Hello");
        } while (true);
    }

    public static void posNegZero() {
        int positive = 0, negative = 0, zero = 0, sum = 0;

        while (true) {
            System.out.println("Enter a number (or type 'stop' to exit): ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                float f = Float.parseFloat(s);
                if (f > 0) {
                    System.out.println("Positive");
                    positive++;
                } else if (f < 0) {
                    System.out.println("Negative");
                    negative++;
                } else {
                    System.out.println("Zero");
                    zero++;
                }
                sum++; // Count total numbers entered
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Display summary
        System.out.println("\nSummary:");
        System.out.println("Total numbers entered: " + sum);
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeroes: " + zero);

    }

    public static void formula(int n, int k) {
        int power = 1;  // Initialize result as 1
        for (int i = 0; i < k; i++) {
            power *= n;  // Multiply n, k times
        }
        System.out.println(power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the three no's:");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // AvrageOfNo(a,b,c);

        // System.out.println("enter the value of n: ");
        // int n=sc.nextInt();
        // int sum=sumOfOddNO(n);
        // System.out.println(sum);
        // System.out.println("enter the two no");
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float large = largestNo(a, b);
        // System.out.println("Largest no is :" + large);
        // System.err.println("enter the radius:");
        // float radius = sc.nextFloat();
        // float circum = circumfranceOfCircle(radius);
        // System.out.println("Circumfrance of circle is :" + circum);
        // System.err.println("enter the age:");
        // int age = sc.nextInt();
        // isVote(age);
        // System.err.println("calling demo :");
        // doWhile();
        // posNegZero();
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        System.out.println("enter the value of k:");
        int k = sc.nextInt();
        formula(n, k);

    }
}
