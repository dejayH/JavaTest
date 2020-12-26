package cn.tedu.text;
//测试 接口
public class Test4Interface {
    public static void main(String[] args) {
        A c = new C();
        c.drink();
        c.eat();
        c.sleep();
    }
}

interface A{
    abstract public void eat();
    abstract public void drink();
    abstract public void sleep();

}
abstract class B implements A{}
class C implements A{
    @Override
    public void eat() {
        System.out.println("吃东西");
    }
    @Override
    public void drink() {
        System.out.println("喝东西");
    }
    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
}