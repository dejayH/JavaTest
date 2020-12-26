package cntedu.lang;
//测试 Thread
public class Test3Thread {
    public static void main(String[] args) throws Exception {
        //TODO 1,创建对象
        Thread thread = new Thread();

        //TODO 2,调用方法
        long id = thread.getId();
        System.out.println(id);
        String name = thread.getName();
        System.out.println(name);
        thread.run();
        thread.setName("567");
        thread.start();
        thread.stop();
        Thread.sleep(3000);
        //获取正在执行任务的线程对象的引用
        System.out.println(Thread.currentThread().getId());

    }

}
