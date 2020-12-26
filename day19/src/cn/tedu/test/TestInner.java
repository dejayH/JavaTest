package cn.tedu.test;

public class TestInner {
    public static void main(String[] args) {
        Inter in = () -> { System.out.println("睡觉"); };
        in.sleep();
        Out out = new Out() {

            @Override
            public void eat() {
                System.out.println("吃粑粑");
            }

            @Override
            public void buy() {
                System.out.println("买粑粑");
            }
        };
        out.buy();

    }
}

interface Inter {

    void sleep();

}
interface Out {
    void eat();
    void buy();
}
