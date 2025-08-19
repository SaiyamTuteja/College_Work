
import java.util.Scanner;

class Main {

    static void LinearSearch(int[] arr, int key) {
        int size = arr.length - 1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element is present at index " + i);
            }

        }
    }

    static void neonNO(int n) {
        int sum = 0;
        int square = n * n;
        int temp = square;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;

        }
        if (sum == n) {
            System.out.println(n + " is a Neon Number");
        } else {
            System.out.println(n + " is not a Neon Number");
        }

    }

    static void leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Its a Leap Year" + year);
        } else {
            System.out.println("It's not a leap year:" + year);
        }

    }

    static int GCD(int a, int b) {
        if (a == 0 || b == 0 || a == b) {
            return a;
        }
        if (a > b) {
            return GCD(a - b, b);

        }
        return GCD(a, b - a);
    }

    static String addTwoString(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        int sum = n1 + n2;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("even no");
        } else {
            System.out.println("odd no");
        }

    }

    static void largest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String a = "10", b = "01";
        // System.out.println(addTwoString(a, b));
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // evenOdd(a);
        // largest(a, b, c);
        // System.out.println(GCD(a, b));
        // int year = sc.nextInt();
        // leapYear(year);
        // int n = sc.nextInt();
        // neonNO(n);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("enter the element: " + i + " ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to search");
        int key = sc.nextInt();
        LinearSearch(arr, key);

    }
}
