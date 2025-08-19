// Creating thread by extending Thread class

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultithreadingDemo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // thread 1
        MyThread t2 = new MyThread(); // thread 2

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start(); // moves t1 to runnable state
        t2.start(); // moves t2 to runnable state
    }
}
