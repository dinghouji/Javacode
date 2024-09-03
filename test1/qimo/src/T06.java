//6、从键盘上输入两个整数 a 和 n，计算 a+aa+aaa+…+aaa…a（n 个 a）的值，并输出计算结果。例如当
//a=2，n=4 时即计算 2+22+222+2222 的值。

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Math.pow;

public class T06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        fun(a,n);
    }

    public static void fun(int a, int n){
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < n; i++)
        {
            sum1 = 10 * sum1 +a;
            sum = sum +sum1;
        }

        System.out.println(sum);
    }
}

