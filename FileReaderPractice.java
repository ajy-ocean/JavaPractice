import java.io.FileReader;
import java.io.IOException;

public class FileReaderPractice {

    public static void main(String[] args) {
        FileReader fileRead = null;
        int content = 0;

        /* Character by Character */
        try {
            fileRead = new FileReader("./FileReaderPractice.java");
            while (content != -1) {
                content = fileRead.read();
                if (content == -1) {
                    break;
                }
                // It's print not println
                System.out.print((char) content);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
         * File Reading using character Array....
         */

        // char[] store = new char[3000];
        // try {
        // fileRead = new FileReader("./FileReaderPractice.java");
        // content = fileRead.read(store);
        // for (int i = 0; i < store.length; i++) {
        // // It's print not println
        // System.out.print((char) store[i]);
        // }

        // } catch (Exception e) {
        // e.printStackTrace();
        // }
    }
}
