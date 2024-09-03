public class Test {
    public static void main(String[] args) {
        Animal cat1  = new Cat();
        Animal cat  = new Cat();  //上转型， 编译看左边，运行看右边
        cat1.run();
        cat1.eat();

    }
}
