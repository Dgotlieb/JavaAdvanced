import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String [] args) {
        Employee john = new Employee();
        john.name = "John";
        john.address = "New York";

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(john);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
