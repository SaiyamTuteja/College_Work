
import java.util.Scanner;

class Box {

    private double width, height, depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    public double getVolume() {

        return width * height * depth;

    }
}

class Calculater {

    static double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }

    static double division(double n1, double n2) {
        return n1 / n2;
    }
}

class Area {

    void area(int l, int b) {
        System.out.println("Area of rectangle is : " + l * b);
    }

    void area(int side) {
        System.out.println("Area of Square is : " + side * side);
    }

    void area(double radious) {
        System.out.println("Area of Square is : " + 3.14 * radious * radious);

    }

}

class Author {

    String Name;
    String Email;
    char Gender;

    Author(String Name, String Email, char Gender) {
        this.Email = Email;
        this.Name = Name;
        this.Gender = Gender;

    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public char getGender() {
        return Gender;

    }

    public String toString() {
        return "Author: " + Name + " (" + Gender + "), Email: " + Email;
    }

}

class Book {

    String Name;
    Double Price;
    Author author;
    int qtyInStock;

    Book(String Name, Author author, Double Price, int qtyInStock) {
        this.Name = Name;
        this.Price = Price;
        this.author = author;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String toString() {
        return "Book: " + Name + "\n" + author + "\nPrice: $" + Price + "\nStock: " + qtyInStock;
    }

}

class Animal {

    void eat() {
        System.out.println("eating");
    }

    void sleep() {
        System.out.println("sleeping");

    }

}

class Bird extends Animal {

    void eat() {
        System.out.println("Eating Bird");
    }

    void sleep() {
        System.out.println("Sleeping Bird");

    }

    public void fly() {
        System.out.println("Bird is flying in the sky.");
    }
}

class Main {

    public void arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {

            System.out.println(arr[i] + " ");
        }

    }

    public void primeNonPrime() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("enter the no for prime and non prime no : ");
        a = sc.nextInt();

        for (int i = 2; i * i <= a; i++) {

            if (a % i == 0) {
                System.out.println("no is not prime");
                return;
            }
        }
        System.out.println("Prime NO");

    }

    public int factorial() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("enter the no for factorial : ");
        a = sc.nextInt();
        sc.close();
        int fact = 1;

        while (a > 0) {
            fact = fact * a;
            a--;
        }
        return fact;
    }

    public int lastDigitSum() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("enter the value 1 : ");
        a = sc.nextInt();
        System.out.print("enter the value 2 : ");
        b = sc.nextInt();
        int rem1 = a % 10;
        int rem2 = b % 10;
        System.out.print("Sum is : ");

        return rem1 + rem2;

    }

    public int evenDigitsSum() {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the value 1: ");
        a = sc.nextInt();
        System.out.print("Enter the value 2: ");
        b = sc.nextInt();

        int sum = 0;

        // Extract digits of 'a'
        while (a > 0) {
            int digit = a % 10; // Get last digit
            if (digit % 2 == 0) { // Check if even
                sum += digit;
            }
            a /= 10; // Remove last digit
        }

        // Extract digits of 'b'
        while (b > 0) {
            int digit = b % 10; // Get last digit
            if (digit % 2 == 0) { // Check if even
                sum += digit;
            }
            b /= 10; // Remove last digit
        }

        sc.close();
        return sum;
    }

    public int cyclicSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        sc.close();
        int totalSum = 0;
        int sum = 0;
        while (a > 0) {
            int temp = a;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;

            }
            totalSum += sum;

            a %= Math.pow(10, (int) Math.log10(a));
        }
        return totalSum;
    }

    public int StringPin() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        int sum = 0;
        String[] words = s1.split(" ");
        for (String word : words) {
            sum += word.length();
        }

        while (sum >= 10) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;

            }
            sum = tempSum;

        }
        return sum;
    }

    public String genratePin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of Num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the value of Num3: ");
        int num3 = sc.nextInt();

        int ones1 = num1 % 10;
        int tens1 = (num1 / 10) % 10;
        int hundred1 = (num1 / 100) % 10;

        int ones2 = num2 % 10;
        int tens2 = (num2 / 10) % 10;
        int hundred2 = (num2 / 100) % 10;

        int ones3 = num3 % 10;
        int tens3 = (num3 / 10) % 10;
        int hundred3 = (num3 / 100) % 10;

        int pinOne = Math.min(Math.min(ones1, ones2), ones3);
        int pinTens = Math.min(Math.min(tens1, tens2), tens3);
        int pinHundred = Math.min(Math.min(hundred1, hundred2), hundred3);

        int maxDigit = Math.max(Math.max(hundred1, Math.max(ones1, tens1)), Math.max(hundred2, Math.max(ones2, tens2)));
        maxDigit = Math.max(maxDigit, Math.max(hundred3, Math.max(ones3, tens3)));
        String finalPin = "" + maxDigit + pinHundred + pinTens + pinOne;
        System.out.println("The final Genrated fin is : " + finalPin);
        return finalPin;
    }

    public int fabonica() {
        int prev = 0;
        int next = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postive no for fabonica : ");
        int num = sc.nextInt();
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;

        }

        for (int i = 3; i <= num; i++) {
            sum = prev + next;
            prev = next;
            next = sum;
        }

        return sum;
    }

    public void JaggedArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int[][] jaggedArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (jaggedArray[i][j] % 2 == 0) {
                    evenSum += jaggedArray[i][j];
                } else {
                    oddSum += jaggedArray[i][j];
                }
            }
        }
        System.out.println("\nSum of even elements: " + evenSum);
        System.out.println("Sum of odd elements: " + oddSum);
        sc.close();
    }

    public static void main(String[] args) {
        Main Obj = new Main();
        // Obj.arrayInput();
        // Author author = new Author("J.K. Rowling", "jkrowling8@gamil.com", 'F');
        // Book book = new Book("Harry Potter", author, 29.99, 100);
        // System.out.println(book);
        // Obj.primeNonPrime();
        // System.out.println(Obj.factorial());
        // Area a = new Area();
        // a.area(2.0);
        // a.area(12, 10);
        // a.area(3);
        // Box b1 = new Box(12, 13, 20);
        // System.out.println(b1.getVolume());
        // Calculater c = new Calculater();
        // System.out.println(c.division(20.1, 10.0));
        // System.out.println(c.power(10, 2));
        // System.out.println(Obj.fabonica());
        // System.out.println(Obj.genratePin());
        // System.out.println(Obj.StringPin());
        // System.out.println(Obj.lastDigitSum());
        // System.out.println(Obj.evenDigitsSum());
        // System.out.println(Obj.cyclicSum());

        // Animal a = new Animal();
        // Bird b = new Bird();
        // Animal ab = new Bird();
        // a.eat();
        // b.eat();
        // b.fly();
        // a.sleep();
        // b.sleep();
        // ab.eat();
        // ab.sleep();
        Obj.JaggedArray();

    }
}
