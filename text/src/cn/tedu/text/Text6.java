package cn.tedu.text;
//测试 接口的复杂用法
public class Text6 {
    public static void main(String[] args) {
        //TODO 多态对象测试
        Inter1 in = new InterImp2();
        Inter2 in2 = new InterImp2();
        //只能调用左边提供的功能
        InterImp2.tex();

    }
}
interface Inter1{
    void save();
}
interface Inter2{
    void get();
}
interface Inter3 extends Inter1 , Inter2{
    void delete();
}
class InterImp2 implements Inter3,Inter1,Inter2{
    @Override
    public void save() {
        System.out.println("保存");
    }
    @Override
    public void get() {
        System.out.println("获取");
    }
    @Override
    public void delete() {
        System.out.println("删除");
    }
    public static void tex(){
        System.out.println("静态的");
    }
}
