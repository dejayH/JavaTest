package cn.tedu.reflect;

public class Student {
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //TODO Fields -- 加public方便反射
    private int age;
    public String name;

    //TODO
    private void show(int a) {
        System.out.println("show()-" + a);
    }
}
