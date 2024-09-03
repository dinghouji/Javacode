
//1、从键盘输入 10 个整数存入一维数组 m 中，以数组 m 为参数调用自定义方法 getMinAndMax(int b[])。
//其中 getMinAndMax(int b[])方法计算数组 b 的最大值和最小值并输出。

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        int[] m; m = new int[10];
        System.out.println("请输入10个整数：");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 10; i++){
            m[i] = scanner.nextInt();
        }
        GetMinAndMax(m);


    }

    public static void GetMinAndMax(int[] b){
        int min = b[0];
        int max = b[0];
        for(int i = 1;i < 10; i++){
            if(min > b[i]){
                min = b[i];
            }
            if(max < b[i]){
                max = b[i];
            }
        }
        System.out.println("Min = " + min +" " + "Max = " + max);
    }
}


