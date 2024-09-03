class Student {
    private String id;
    private String name;

    // Constructor for Student class
    void student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("学生的姓名是" + name + " id是" + id);
    }

    String get_id() {
        return id;
    }

    String get_name() {
        return name;
    }
}

class PostGraduate extends Student {
    private String major;

    // Constructor for PostGraduate class
    void student(String id, String name, String major) {
        super.student(id, name); // Correctly call the superclass method
        this.major = major;
    }

    void show() {
        System.out.println("研究生学生的姓名是" + get_name() + " id是" + get_id() + " 专业是" + major);
    }
}

public class E_04 {
    public static void main(String[] args) {
        PostGraduate p1 = new PostGraduate();
        p1.student("01", "Mars", "计算机");
        p1.show();
    }
}
