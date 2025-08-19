
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();

        System.out.println("Client Connected");

        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println("client Says : " + str);

        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println("Server is connected ");
        pw.flush();

    }

};
