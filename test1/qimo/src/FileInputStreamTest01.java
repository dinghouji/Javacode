import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        InputStream f1 = new FileInputStream(("test1\\qimo\\src\\a.txt"));
//        int b1 = f1.read();
//        System.out.println(b1);
//
//        int b2  = f1.read();
//        System.out.println(b2);
        int b;
        while((b = f1.read()) != -1){
            System.out.print((char) b);
        }

        f1.close();
    }
}
