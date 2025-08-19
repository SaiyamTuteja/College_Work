
import java.io.*;
import java.util.*;

public class SimpleReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            // Write sentence to file using PrintWriter
            PrintWriter pw = new PrintWriter("sentence.txt");
            pw.println(sentence);
            pw.close();

            // Read sentence from file using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("sentence.txt"));
            String line = br.readLine();
            br.close();

            // Reverse the sentence
            String[] words = line.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
