import java.util.*;

public class dinghouji_08 {
    public static void main(String[] args) {
        try{

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个年龄：");
            int a = scanner.nextInt();
            if(a > 100 || a < 0)
            {
                throw new AgeException();
            }
            else{
                System.out.println("你输入的年龄是：" + a);
            }
        }
        catch (AgeException a){
            a.show();

        }
        
    }
}

class Student{
    int age;
    void setage(int age){
        this.age = age;
    }
}

class AgeException extends Exception{
    void show()
    {
        System.out.println("输入的年龄格式错误，请重新输入！");
    }
}