package cn.tedu.ex;

//测试匿名内部类
public class InnerClass2 {
    public static void main(String[] args) {
//        new DemoImpl().save();
        new Demo() {//在匿名内部类里,重写抽象方法
            @Override
            public void save() {
                System.out.println("save..");
            }
        }.save();

        Demo2 y = new Demo2() {
            @Override
            public void delete() {
                System.out.println("delete");
            }

            @Override
            public void get(int id) {
                System.out.println("id===" + id);
            }
        };
        y.delete();
        y.get(123);

        new Demo3() {

            @Override
            public void in() {
                System.out.println("in...");
            }
        }.in();
    }
}

abstract class Demo3 {
    abstract public void in();
}

interface Demo2 {
    void delete();

    void get(int id);
}

interface Demo {
    void save();
}

class DemoImpl implements Demo {

    @Override
    public void save() {
        System.out.println("保持");
    }
}
