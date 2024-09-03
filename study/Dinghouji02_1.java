class Village{
	static int waterAmount;
	int peopleNum;
	String name;
	void drinkWater(String name ,double s)
	{
		if(waterAmount - s >= 0)
		{
			waterAmount -= s;
			System.out.println(name + "喝了："+ s + "升水");
		}
		else {
			waterAmount = 0;
			System.out.println("水量不够了");
		}
	}

	void lookWater(String name)
	{
		System.out.println(name + "发现水井有：" + waterAmount + "升");
	}
	void set_peoplenum(int n)
	{
		peopleNum = n;
	}
	void set_name(String na)
	{
		name = na;
		
	}
	void set_water(int n){
		waterAmount = n;
	}
	void print_name(String name,int num){
		System.out.println(name+"的人口为：" + num);
	}
}

public class  Dinghouji02_1{
	public static void main (String[] args){
		Village v1 = new Village();
		Village v2 = new Village();
		v1.set_water(400);
		v1.set_name("A村");
		v2.set_name("B村");
		v1.set_peoplenum(300);
		v2.set_peoplenum(500);
		v1.drinkWater(v1.name,30);
		v2.lookWater(v2.name);
		v1.print_name(v1.name,v1.peopleNum);
		v2.print_name(v2.name,v2.peopleNum);

 	}

}