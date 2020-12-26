package cn.tedu.text;
//测试随机不重复整数
import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        method();
        method2();
    }

    private static void method2() {

    }

    private static void method() {
        int[] na = new int[10];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            na[i] = new Random().nextInt(10)+1;
            while (i>j) {
                for (j = 0; j < i; j++) {
                    if (na[i] == na[j]) {
                        na[i] = new Random().nextInt(10) + 1;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(na));

    }

}
