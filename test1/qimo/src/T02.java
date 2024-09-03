//2、从键盘输入一个整数 num，以该整数为参数调用名称为 fun 的自定义方法，并输出方法的返回值。
  //  其中 fun 方法接收一个名称为 n 的整型参数，当 n 为偶数时，返回 1/2+1/4+…+1/n 的值；当 n 为奇数
  //  时，返回 1/1+1/3+…+1/n 的值。
//

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数num：");
        int num = scanner.nextInt();
        System.out.println(fun(num));
    }

    public static double fun(int n){
        double sum  = 0.0;
        if(n % 2 == 1){
            for(int i = 1;i <= n;i += 2){
                sum += 1.0/i;
            }
        }
        else {
            for (int i = 2; i <= n; i += 2) {
                sum += 1.0 / i;
            }
        }
        return sum;
    }
}
