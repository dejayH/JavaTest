package cntedu.lang;
//模拟多线程编程
public class Test4Thread {
    public static void main(String[] args) throws Exception {
        Mythread t = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        //多线程的随机性:全是CPU调度,程序无法控制
//        t.run();//普通的方法调用,没有抢的多线程效果
        t.start();//启动线程
        t.setName("没错");
        t2.start();
        t2.setName("对");
        t3.start();
        t3.setName("真的");
    }


}
//1,定义线程类--继承Thread类
class Mythread extends Thread{
    //打印10次线程名称--必须放在重写的run()方法里
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(super.getName()+"=="+i);

        }
    }


}
