

import java.io.*;

public class dinghouji_09 {
    public static void main(String[] args) {
        File f = new File("E:/javacode/pic.jpg");
        InputStream in = new FileInputStream(f);
    }

}

class move {
    public static void main(String[] args)
    {
        String src="E:/javacode/pic.jpg";
        String target="E:/javacode/pic1.jpg";
        copyFile(src,target);
    }
    public static void copyFile(String src,String target)
        {   
            File srcFile = new File(src);  
               File targetFile = new File(target);  
               try {  
                   InputStream in = new FileInputStream(srcFile);   
                   OutputStream out = new FileOutputStream(targetFile);  
                   byte[] bytes = new byte[1024];  
                   int len = -1;  
                   while((len=in.read(bytes))!=-1)
                   {  
                       out.write(bytes, 0, len);  
                   }  
                   in.close();  
                   out.close();  
               } catch (FileNotFoundException e) {  
                   e.printStackTrace();  
               } catch (IOException e) {  
                   e.printStackTrace();  
               }  
               System.out.println("文件复制成功"); 
 
 
        }
               
    }