
import java.io.*;

class Person implements Serializable {

    private String name;
    private int id;

    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person id=" + id + ", name= " + name;
    }
}

public class SerializationDemo {

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setData(10, "umang");

        // Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(person);
        System.out.println("Write operation completed");

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person deserializedPerson = (Person) ois.readObject();
        System.out.println("Deserialized object: " + deserializedPerson);

    }
}
