
import java.util.*;

class A {

    void m1() {
        System.out.println("m1()");
    }
}

class B extends A {

    void m1() {
        System.out.println("m2()");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A ob1 = new A();
        B ob2 = new B();
        ob1.m1();
        ob2.m1();
        A ob3 = new B();// Upcasting
        ob3.m1();

    }
}
