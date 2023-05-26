import java.io.OutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

class Temp implements Serializable {

    private int id;
    private String name;
    private transient String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id:" + id + " name:" + name;
    }

}

public class SerializationPractice {

    public static void main(String[] args) {
        Temp temp = new Temp();
        temp.setId(1);
        temp.setName("Ajay");

        try {
            System.out.println("Writing Temp object into file serialize");
            OutputStream objOut = new FileOutputStream("./Serialize.ser");
            ObjectOutputStream objOutStream = new ObjectOutputStream(objOut);
            objOutStream.writeObject(temp);
            
            System.out.println("Reading Temp object into file serialize");
            InputStream inStream = new FileInputStream("./Serialize.ser");
            ObjectInputStream objIn = new ObjectInputStream(inStream);
            Temp t = (Temp)objIn.readObject();
            System.out.println("Details of Serialize.ser File\n"+t);

            
        } catch (Exception e) {
            e.printStackTrace(); 
        }

    }
}