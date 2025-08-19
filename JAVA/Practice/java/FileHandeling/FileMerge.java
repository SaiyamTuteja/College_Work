
import java.io.*;

class FileMerge {

    public static void main(String[] args) throws IOException {
        File f1 = new File("f1.txt");
        f1.createNewFile();
        FileWriter fw1 = new FileWriter("f1.txt");
        fw1.write("file one ka content hai bhai ya");
        fw1.close();
        System.out.println("bhai file 1 ban gayi hai");
        File f2 = new File("f2.txt");
        f2.createNewFile();
        FileWriter fw2 = new FileWriter("f2.txt");
        fw2.write("file two ka content hai bhai ya");
        fw2.close();
        System.out.println("bhai file 2 ban gayi hai");

        File f3 = new File("merged.txt");
        FileWriter fwm = new FileWriter(f3);
        BufferedReader br1 = new BufferedReader(new FileReader("f1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("f2.txt"));

        String line;
        while ((line = br1.readLine()) != null) {
            fwm.write(line + "\n");
        }

        while ((line = br2.readLine()) != null) {

            fwm.write(line + "\n");
        }
        br1.close();
        br2.close();
        fwm.close();
        System.out.println("Bhai files merge ho gayi hain!");
    }
}
