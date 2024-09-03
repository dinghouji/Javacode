import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class Testcopy {
    public static void main(String[] args) throws Exception {
        FileInputStream f1 = new FileInputStream(("E:\\Mars.jpg"));
        FileOutputStream f2 = new FileOutputStream(("D:\\Mars1.jpg"));

        int len;
        byte [] b = new byte[1024];
        while((len = f1.read(b)) != -1){
            f2.write(b , 0, len);
        }
        f1.close();
        f2.close();

        System.out.println("复制完毕！");
    }

}
