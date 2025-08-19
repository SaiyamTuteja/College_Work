
import java.util.Scanner;

class MinException extends Exception {

    public MinException(String Str) {
        super(Str);
    }
}

class MaxException extends Exception {

    public MaxException(String Str) {
        super(Str);
    }

}

public class MinMaxException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        try {
            if (amount < 500) {
                throw new MinException("Minimum amount then 500 ");

            } else if (amount > 1000) {
                throw new MaxException("Amount is too high! Maximum is 1000.");
            } else {
                System.out.println("Amount take : " + amount);
            }

        } catch (MinException | MaxException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
};
