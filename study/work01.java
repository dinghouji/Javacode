
import java.util.Scanner;
import java.util.Random;
public class  work01{
	public static void main (String[] args)
	{
		Random r = new Random();
		int range1  = r.nextInt(101);
		int count  = 0,num =0;
		int guess = range1;
		System.out.print("给你一个1--100之间的整数请猜测这个数字：");
		while(num != guess)
		{
			Scanner scanner = new Scanner(System.in); 
			
			num  = scanner.nextInt();
			count ++;
			if (num > guess)
			{
				System.out.println("大了大了，请输入小一点的数字：");

			}
			else if(num < guess)
			{
				System.out.println("小了小了，请输入大一点的数字：");
			}

		}

		System.out.println("你一共输入了"+ count+ "次");
	}
}