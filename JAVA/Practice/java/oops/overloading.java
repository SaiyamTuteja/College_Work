//overloading is also know as the compile time polymorphism 

class A {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {//same name but differnet no of arguments 
        return a + b + c;
    }

    public double add(double a, double b) {// same parametes but differnt data types 
        return a + b;
    }
}

class Main {

    public static void main(String[] args) {
        A obj1 = new A();
        System.err.println(obj1.add(12, 13));
        System.out.println(obj1.add(1, 2, 3));
        System.out.println(obj1.add(1.2, 2.0));

    }

}
