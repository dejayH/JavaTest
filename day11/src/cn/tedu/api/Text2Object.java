package cn.tedu.api;

import java.util.Objects;

public class Text2Object {
    public static void main(String[] args) {
        Student st = new Student("无与伦比", 20);
        System.out.println(st.toString());
        Student st1 = new Student("无与伦比", 20);
        Student st2 = new Student("无与伦比", 20);
        System.out.println(st1.equals(st2));
    }
}

class Student {
    //TODO Constructors
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //TODO fields
    private String name;
    private int age;

    //TODO get()/set()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //TODO 重写toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //TODO 重写equals
    /*public boolean equals(Object obj){
        Student s = (Student) obj;
        if(s.name == name && s.age == age){
            return true;
        }else{
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}