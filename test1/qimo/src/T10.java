//10、定义一个图书类 Book，Book 类有两个私有成员变量：b_id 描述图书编号、bname 描述图书名称；
//有带两个形参的构造方法、成员方法 printMess()用于输出 Book 对象的编号、名称信息。定义一个
//computerBook 类继承 Book，并新增成员变量 author 描述作者，重写 printMess()方法输出 computerBook
//对象的信息。在主类中创建一个 computerBook 类的对象，输出其信息。

public class T10 {
    public static void main(String[] args) {
        ComputerBook cb = new ComputerBook(200,"算法","Mars");
        cb.printMess();
    }
}
class Book{
    private int b_id;
    private String bname;
    Book(int b_id,String bname){
        this.b_id = b_id;
        this.bname = bname;
    }
    public  void printMess(){
        System.out.println("编号是：" + b_id + " " + "名称是：" + bname);
    }

    public int getB_id(){
        return this.b_id;
    }
    public String getbname(){
        return this.bname;
    }
}
class ComputerBook extends Book{
    private final String author;
    ComputerBook(int b_id, String bname,String author){
        super(b_id,bname);
        this.author = author;
    }
    public  void printMess(){
        System.out.println("编号是：" + getB_id() +" "+ "名称是：" + getbname() + " " + "作者是：" + author);
    }
}