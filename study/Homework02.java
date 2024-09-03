import java.util.Scanner;

public class Homework02 {
	public static void main (String[] args){
		Scanner myscanner = new Scanner(System.in);
		int num = myscanner.nextInt();
		if(num > 0){
			System.out.println("the num is > 0");
		}else if(num == 0){
			System.out.println("the num is = 0");

		}else{
			System.out.println("the num is < 0");
		}
		
	}
}
