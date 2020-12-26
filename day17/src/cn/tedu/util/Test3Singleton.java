package cn.tedu.util;

public class Test3Singleton {
    public static void main(String[] args) {
        //TODO
        Student2 s = Student2.getS();
        Student2 s2 = Student2.getS();
        System.out.println(s == s2 ? "bingo" : "worse");
        Student s3 = Student.getS();
        Student s4 = Student.getS();
        System.out.println(s3 == s4 ? "bingo" : "worse");
    }
}

//懒汉式--面试常见--按需加载/延迟加载--线程安全
class Student2 {
    private Student2() {
    }

    static private Student2 s;

    //TODO 共享资源s被多条语句操作了,一定会不安全,需要加锁
    synchronized static public Student2 getS() {
//        synchronized (Student2.class) {
        if (s == null) {//没new过才new
            s = new Student2();
        }
        return s;
//        }
    }

}

//饿汉式
class Student {
    private static Student s = new Student();

    private Student() {
        System.out.println("test....");
    }

    public static Student getS() {
        return s;
    }
}