//5、编写 Java 应用程序，用字节输入、输出流将 D 盘下文件 src.jpg 复制到 E 盘，命名为 des.jpg。

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class T05 {
    public static void main(String[] args) {
        String sourceFilePath = "D:\\src.jpg";
        String destinationFilePath = "E:\\des.jpg";

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("文件复制成功！");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
