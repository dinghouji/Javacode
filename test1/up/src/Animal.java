public class Animal {
    public void  run(){
        System.out.println("爷会跑");
    }
    public void eat(){
        System.out.println("爷会吃");
    }
}

class Cat extends Animal{
    public void run (){
        System.out.println("猫会跑");
    }
    public void clim(){
        System.out.println("猫会爬");
    }
}

class Dog extends  Animal{
    public void run()
    {
        System.out.println("狗会跑");
    }

    public void eat(){
        System.out.println("狗会吃");
    }

    public void Wang(){
        System.out.println("狗会旺旺");
    }
}

