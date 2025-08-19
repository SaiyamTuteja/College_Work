interface A {
    void m1(); // Abstract method (No body allowed)
}

interface B extends A {
    void m2(); // Abstract method (No body allowed)
}

// A class implementing the interface
class C implements B {
    public void m1() {
        System.out.println("m1 method called");
    }

    public void m2() {
        System.out.println("m2 method called");
    }
}

 class Main {
    public static void main(String[] args) {
        C obj = new C(); // Creating an object of class C
        obj.m1(); // Calls m1() from A
        obj.m2(); // Calls m2() from B
    }
}
