import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Filecopy {
    public static void main(String[] args) throws Exception {
        FileInputStream f1 = new FileInputStream(("D:\\src.jpg.jpg"));
        FileOutputStream f2 = new FileOutputStream(("E:\\Mars.jpg"));

        byte[] b = new byte[1024];
        int len;

        while((len = f1.read(b)) != -1){
            f2.write(b , 0 ,len);
        }
        f1.close();
        f2.close();

        System.out.println("复制完成！");
    }
}
