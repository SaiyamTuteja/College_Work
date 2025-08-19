
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class FactServer {

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <=number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Server Connected ");
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        int num = dis.readInt();
        int result = factorial(num);
        dos.writeInt(result);
        dos.close();
        dis.close();
        s.close();
        // int fact = factorial(6);
    }
};
