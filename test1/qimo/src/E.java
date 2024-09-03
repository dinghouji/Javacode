import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class E {
    public static void main(String args[]){
        File file = new File("abc.txt");
        byte [] b = "happytime".getBytes();
        try{
            FileOutputStream out = new FileOutputStream(file);
            out.write(b); out.close();
            FileInputStream in = new FileInputStream(file);
            byte [] a = new byte[5];
            int m =in.read(a);
            String s = new String(a); System.out.println(s);
            m = in.read(a,0,5); System.out.println("m="+m);
            in.close();
        }
        catch(Exception exp){ exp.printStackTrace(); }
    }
}