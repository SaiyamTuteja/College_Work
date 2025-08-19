import java.io.*;

class PrimeNonPrimeFile {
    public static void main(String[] args) throws IOException {

        // Step 1: Write numbers from 1 to 998 into number.txt
        PrintWriter pw1 = new PrintWriter(new FileWriter("number.txt"));
        for (int i = 1; i < 999; i++) {
            pw1.println(i);
        }
        pw1.close();
        System.out.println("Inserted successfully into number.txt");

        // Step 2: Read from number.txt and write primes to prime.txt
        BufferedReader br = new BufferedReader(new FileReader("number.txt"));
        PrintWriter primeFile = new PrintWriter(new FileWriter("prime.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            int num = Integer.parseInt(line);
            if (isPrime(num)) {
                primeFile.println(num);
            }
        }

        br.close();
        primeFile.close();

        // Step 3: Read from prime.txt and display primes
        BufferedReader brPrime = new BufferedReader(new FileReader("prime.txt"));
        System.out.println("Prime numbers:");
        while ((line = brPrime.readLine()) != null) {
            System.out.print(line + " ");
        }
        brPrime.close();
    }

    // Prime number checker method
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
