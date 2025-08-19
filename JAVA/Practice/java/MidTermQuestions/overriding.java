
class A {

    public void add(int a, int b) {

        int sum = a + b;
        System.out.println(sum);
    }

    public float add(float a, float b) {
        float sum = a + b;
        return sum;

    }

    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        A obj1 = new A();
        int a = 10;
        int b = 20;
        obj1.add(a, b);
        obj1.add(10, 20.5f);
        obj1.add(a, b, 10);

    }
}
