package cn.tedu.test;

import java.util.Arrays;

public class ArrayListTest1 {
    public static void main(String[] args) {
        moethod();

    }

    private static void moethod() {
        int size = 0;
        Object[] o = new Object[10];
        o[size++] = 10;
        o[size++] = 1.1;
        o[size++] = "hello";
        o[size++] = true;

        for (Object t : o) {
            if (t != null) {
                System.out.println(t);
            }
        }

        //容量不够就扩容
        if (size > o.length) {
            Object[] b = Arrays.copyOf(o, (int) (o.length * 1.5));
            System.out.println(b);
        }
    }
}
