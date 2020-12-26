package cntedu.lang;
//测试模拟多线程编程
public class Test5Thread {
    public static void main(String[] args) {
        MyRun m = new MyRun();
//        m.run();
        Thread r = new Thread(m);
        r.start();
        r.setName("一样");
        Thread t = new Thread(m);
        t.start();
        t.setName("二筒");
    }
}

class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+".."+i);
        }
    }
}