
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println("hello");
        pw.flush();

        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        String Str2 = br.readLine();
        System.out.println("Server Says : " + Str2);

    }
};
