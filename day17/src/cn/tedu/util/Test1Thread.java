package cn.tedu.util;

//模拟多线程售票--继承Thread类
public class Test1Thread {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        Ticket t4 = new Ticket();
        t1.start();
        t1.setName("1号售票窗口");
        t2.start();
        t2.setName("2号售票窗口");
        t3.start();
        t3.setName("3号售票窗口");
        t4.start();
        t4.setName("4号售票窗口");

    }
}

class Ticket extends Thread {
    //设计4个售票窗口,总计售票100张
    //TODO 如果共享资源是静态的,锁对象必须固定--类名.class
    private static int ticket = 100;

    @Override
    public void run() {
        int num = 1;
        while (true) {
            synchronized(Ticket.class) {
                if (ticket > 1) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(super.getName() + "卖了" + num++ + "张票,总票数还剩" + (ticket-- - 1) + "张");
                } else if (ticket == 1) {
                    ticket--;
                    System.out.println(super.getName() + "卖了" + num++ + "张票,票卖光了");
                } else {
                    break;
                }
            }
        }
    }
}
