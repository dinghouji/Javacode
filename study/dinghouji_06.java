import java.util.*;

public class dinghouji_06 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        try {
            System.out.println("--输入两个整数：--");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入a:");
            a = scanner.nextInt();

            System.out.println("请输入b:");
            b = scanner.nextInt();

            c = a / b;
            System.out.println(a + " / " + b + " = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("算数异常 ，请重新输入 " + e);
        }
        catch (InputMismatchException s) {
            System.out.println("输入数据异常,请重新输入 " + s);
        }

        System.out.println("程序运行结束");
    }
}
