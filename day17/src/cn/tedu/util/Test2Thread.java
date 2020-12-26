package cn.tedu.util;

public class Test2Thread {
    public static void main(String[] args) {
        Tickets t = new Tickets();
        Thread t1 = new Thread(t, "1号窗口");
        Thread t2 = new Thread(t, "2号窗口");
        Thread t3 = new Thread(t, "3号窗口");
        Thread t4 = new Thread(t, "4号窗口");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Tickets implements Runnable {
    int ticket = 100;

    @Override
//    synchronized public void run(){}
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            synchronized ("super") {
                if (ticket > 1) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":票还剩" + (ticket-- - 1) + "张");
                } else if (ticket == 1) {
                    System.out.println(Thread.currentThread().getName() + ":票卖光了,下次请早.");
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
