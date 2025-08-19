
public class ParentThread {

    public static void main(String[] args) {
        ChildThread cThread = new ChildThread();
        Thread t1 = new Thread(cThread);
        t1.start();
        for (int i = 0; i < 10; i++) {

            System.out.println("Parent Thread ");
        }
    }
}
