
public class Rode {
	public static void main (String[] args){

	int count  = 0;
	double total = 100000;

	while(total > 0){
		if(total > 50000){
			total = total * 0.95;
			count ++;
		}
		else if(total >= 1000 && total <= 50000){
			total -=1000;
			count ++;
		}
		else{
			break;
		}
	}
	System.out.println(count);
	}
}