
import java.util.Scanner;
public class Wangyuxiang {
	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("请输入数字塔的层数：");
	        int n = scanner.nextInt();
	        
	        System.out.println(n + "层数字塔是：");
	        
	        for (int i = 1; i <= n; i++) {
	            // 输出空格
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }
	            
	            // 输出递增数字
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            
	            // 输出递减数字
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }
	            
	            System.out.println();
	        }
	    }

}