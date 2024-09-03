class Tank{
	private double speed;
	private int bullet;
	public Tank( double speed,int bullet) {
	    this.speed = speed; 
	    this.bullet = bullet;
	  }
	void speedup(double s){
		if(speed + s <= 200)
		{
			speed += s;
			System.out.println("坦克目前的速度为：" + speed);
		}
		else {
			speed = 200;
			System.out.println("坦克目前的速度为200");
		}
	}
	void speeddown(double s){
		if(speed - s >= 0)
		{
			speed -= s;
			System.out.println("坦克目前的速度为："+ speed);
		}
		else {
			speed = 0;
			System.out.println("坦克目前的速度最多减到0");
		}
	}
	void frie(String str,int n){
		System.out.println(str + "正在开火：");
			for(int i = 0; i < n;i ++){
				if (bullet > 0){
					System.out.println("打出一发炮弹");
					bullet = bullet - 1;
				}
				else {
					System.out.println("没有子弹了请装的弹");
					break;
				}
			}
	}
	void setBulletAmount(int p){
		bullet = p;
		System.out.println("当前炮弹的数量为:" + bullet);
	}
	int  getbullet(){
		return bullet;
	}
public class  Dinghouji{
	public static void main (String[] args){
		Tank t1 = new Tank(100,10);
		Tank t2 = new  Tank(100,10);
 		t1.speedup(30);
 		t2.speedup(20);
 		t1.setBulletAmount(30);
 		t2.setBulletAmount(30);
 		t1.frie("t1",5);
 		t2.frie("t2",38);

 	}

}