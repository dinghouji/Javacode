import java.util.Scanner;
import java.util.Random;
public class  work02{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for(int i  = 1;i <= n ;i++)
		{
			for(int m = n - 1; m >= i;m--)
			{
				System.out.print("  ");
			}
			for(int j = 1;j <= i;j ++)
			{

				System.out.print(" " + j);
			}
			for(int j = i -1;j >= 1;j --)
			{

				System.out.print(" "+j);
			}
			System.out.println("");
		}
	}


}