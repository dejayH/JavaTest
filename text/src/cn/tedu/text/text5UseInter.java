package cn.tedu.text;
//测试 接口的使用
public class text5UseInter {
    public static void main(String[] args) {
        Inter in = new InterImp1();
//      in.age = 20;
        System.out.println(InterImp1.age);
        in.a();
    }
}

interface Inter{
    //TODO 1,接口里有构造方法吗--没有
//    public Inter(){}
    //TODO 2,借口里有变量吗--没有
    int age = 10;//常量的简写
//  public static final int age = 10;
    void a();//接口会为简写的抽象方法,自动拼接abstract public
//  abstract public void a();
}
class InterImp1 implements Inter{
    @Override
    public void a(){
        System.out.println("保存数据");
    }

}
