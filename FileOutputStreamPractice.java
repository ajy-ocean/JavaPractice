import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamPractice {

    public static void main(String[] args) {

        FileOutputStream fileWrite = null;
        String contents = "Karlee grey, Cassidy Banks, Abella Danger";
        byte[] store = new byte[100];
        System.out.println("Content Added in the File");

        try {
            fileWrite = new FileOutputStream("./Demo.txt");
            store = contents.getBytes();
            fileWrite.write(store);

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                fileWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
