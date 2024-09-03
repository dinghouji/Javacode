
public class Test {
	public static void main (String[] args){
	
	int count  = 0;
	int total = 100000;

	while(total > 0){
		if(total > 50000){
			total = total * 0.95;
			count ++;
		}
		else{
			total -=1000;
			count ++;
		}
	}
	System.out.println(count);
	}
}