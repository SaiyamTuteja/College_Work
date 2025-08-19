
import java.io.*;
import java.util.Scanner;

class inputOutputFile {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("output.txt");
        File f = new File("output.txt");
        String line;
        System.out.println("Bhai Likh console mai abh file ma jaya ga direct :");
        for (int i = 0; i < 5; i++) {
            line = sc.nextLine();
            pw.println(line);
            pw.flush();
        }
        System.out.println("Bhai Added correctely ");

        BufferedReader br = new BufferedReader(new FileReader("output.txt"));

        System.out.println("Reading from file ");
        int i = 1;
        while ((line = br.readLine()) != null) {
            System.out.println("Line " + i + ":" + line);
            i++;
        }

        System.out.println("task complete");

    }
}

assume a table product with the follwoing feilds id name price in mysql or oracle database
write the jdbc program to insert the data in prof=duct table


write the java program to fetch the data from product table 
