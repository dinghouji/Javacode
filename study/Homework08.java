public class Homework08 {
	public static void main (String[] args){

		double sum = 0;
		for(int  i = 1; i <= 100; i++){
			for(int j = 1; j <= i; j++){
				sum += j;
			}
		}

		System.out.println(sum);
	}
}
