public class Homework06 {
	public static void main (String[] args){
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0){
				if(count < 5){
					System.out.print(" " + i);
					count ++;
				}
				else{
					System.out.println("");
					count = 0;
				}

			}
		}

	}
}