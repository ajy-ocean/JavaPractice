import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamPractice {
    
    public static void main(String[] args) {
        
        FileInputStream fileInputRead = null;
        int content = 0;

        System.out.println("Reading the content of the file by byte by byte");
        try {
            fileInputRead = new FileInputStream("/home/blankocean/codingstuff/codecoffee/practiceJava/FileInputStreamPractice.java");

            System.out.println("No. of Bytes available to read:" +  fileInputRead.available() + "\n");

            System.out.println("File content");
            System.out.println("=============================");

            while (content != -1) {
                content = fileInputRead.read();
                if(content == -1){
                    break;
                }
                //It's print not println
                System.out.print((char)content);
            }
            System.out.println("\nNo of bytes available inside this file is " + fileInputRead.available());
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                fileInputRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=============================");
        
        // System.out.println("Reading the content of the file using byte array");
        // byte[] store = new byte[5000];
        // try {   
        //     fileInputRead = new FileInputStream("./FileInputStreamPractice.java");
        //     content = fileInputRead.read(store);
        //     System.out.println("File contents in byte array");

        //     for(int i =0 ; i<store.length; i++){
                   //It's print not println
        //         System.out.print((char)store[i]);
        //     }
        //     System.out.println("\nNo. of bytes to read from the file:" + content);
            
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}
