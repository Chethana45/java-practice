
import java.io.*;

public class serializationDemo {
    public static void main(String[] args) {
        student s = new student("rohit", "mit", 45);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serialization.txt"))) {
            out.writeObject(s);
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            System.out.println("IO Exception during serialization: " + e);
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialization.txt"))) {
            student readStudent = (student) in.readObject();
            System.out.println("Object deserialized successfully!");
            System.out.println("Name: " + readStudent.name + ", University: " + readStudent.university + ", Age: " + readStudent.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception during deserialization: " + e);
        }
    }
}

class student implements Serializable {
    String name;
    String university;
    int age;

    student(String name, String university, int age) {
        this.name = name;
        this.university = university;
        this.age = age;
    }
}
