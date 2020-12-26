package cn.tedu.ex;

import java.lang.reflect.Field;

public class InnerClass {
    public static void main(String[] args) throws NoSuchFieldException {
        Out out = new Out();
        Out.In in = out.new In();
        in.showIn();
        out.showOut();
    }
}
class Out{//外部类
    String name;
    public void showOut(){
        In in = new In();
        int age = in.age;
        System.out.println(age);
    }
    class In{//内部类--可以在成员位置,爷可以在局部位置
        int age = 10;
        public void showIn(){
            System.out.println(name);
        }
    }
}
