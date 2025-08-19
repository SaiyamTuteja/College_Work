import java.io.*;

class file {

    public static void main(String[] args) {

        try {
            File f = new File("demo.txt");
            if (f.createNewFile()) {
                System.out.println("file ban gayi hia bhai ");
            } else {
                System.out.println("file phala sa bani hui hai bhai");
            }
        } catch (IOException e) {
            System.out.println("file ma kuch error ara hai bhai");
            e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("bhai ya phali line hai \n");
            fw.write("bhai ya dusri  line hai \n");
            fw.close();
            System.out.println("bhai file open karka dekh la likh diya hai mana ");

        } catch (IOException e) {
            System.err.println("bhai error ah gaya " + e);
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("chal ho gaya hia abh bss chill ");
            br.close();
        } catch (IOException e) {
            System.err.println("error ah gaya " + e);
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter("demo.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("this is a demo from buffer writer class ");
            bw.close();
            System.out.println("bhai buffer writer bhi chal gaya abh toh chill kar ");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error ah gaya " + e);
        }

        try {

            FileWriter fw = new FileWriter("demo.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("this is a print writer class demo ");
            pw.println("omfooo print writer bhi chal gaya bhai ");
            pw.flush();
            pw.close();
            System.out.println("bhai abh printwriter class bhi chal gayi hai ");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("error " + e);
        }

        try {
            File f = new File("demo.txt");
            if (f.delete()) {
                System.out.println("file delete ho gayi kush bhai ");
            } else {
                System.out.println("file delete nahi hui hia bhai ");

            }
        } catch (Exception e) {
        }

    }
}




