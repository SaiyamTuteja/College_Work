
class A {

    int RollNo;

    public void student() {
        System.out.println("Student function called from the class A");

    }
}

class B extends A {

    String Name;

    public void faculty() {
        System.out.println("Faculty function called from class B");
    }

}

public class Inheritance {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        A obj3 = new B();
        // B obj4 = new A();//CE
        obj1.student();
        obj2.student();
        obj2.faculty();
        obj3.student();

    }
}
