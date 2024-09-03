import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\Code\\resouser\\Mars.txt");
        System.out.println(f1.length());
        System.out.println("是否为真：" + f1.exists());

    }
}
