
import java.io.*;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\saiya\\Downloads\\Practice\\java\\Dump\\demo.txt", true);
        FileWriter fw2 = new FileWriter("demo2.txt");
        

        // File f = new File("C:\\Users\\saiya\\Downloads\\Practice\\java\\Dump\\demo.txt");
        Scanner sc = new Scanner(System.in);
        String st1;
        System.out.println("Enter the data to enter in the file ");
        st1 = sc.nextLine();
        fw.write(st1);

        fw.close();
        FileReader fr = new FileReader("C:\\Users\\saiya\\Downloads\\Practice\\java\\Dump\\demo.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i + " ");
        }

    }

}
