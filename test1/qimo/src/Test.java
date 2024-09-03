import java.io.*;
public class Test {
    public static void main(String args[]){
        File file = new File("mess.txt");
        char [] b = "2024 年暑假快乐".toCharArray();
        try{
            FileWriter out = new FileWriter(file);
            out.write(b); out.close();
            FileReader in = new FileReader(file);
            char[] a = new char[5];
            int n =in.read(a);
            String s1 = new String(a); System.out.println(s1);
            n = in.read(a,0,5); System.out.println("n="+n);
            in.close();
        }
        catch(Exception exp){ exp.printStackTrace(); }
    }
}