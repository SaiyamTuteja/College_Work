
class Parent {

    public void hairColor() {
        System.err.println("black color hair's");
    }
}

class Child extends Parent {

    public void hairColor() {
        System.out.println("brown color hair's"); // overridding 
    }
}

class Main {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        p.hairColor();
        c.hairColor();
        pc.hairColor();
    

    }

}
