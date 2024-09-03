import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Code1 {
    public static void main(String[] args) throws Exception {
        FileInputStream f1 = new FileInputStream(("D:\\message.txt"));
        FileOutputStream f2 = new FileOutputStream(("D:\\secret.txt"));

        int len;

        byte [] buttle = new byte[1024];
        while((len = f1.read(buttle)) != -1){
            f2.write(buttle, 0, len );
        }
        f1.close();
        f2.close();
        System.out.println("复制完毕！");
    }
}
