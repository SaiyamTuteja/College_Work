
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FactClient {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1234);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        dos.writeInt(num);
        int fact = dis.readInt();
        System.out.println("Factorial of " + num + " is: " + fact);

        dos.close();
        dis.close();
        s.close();
    }
};
