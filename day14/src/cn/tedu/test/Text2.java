package cn.tedu.test;

import java.util.HashSet;
import java.util.Set;

public class Text2 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Set<Integer> s = new HashSet();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(5);
        s.add(1);
        s.add(2);
        s.add(4);
        s.add(3);
        s.add(2);
        for (Integer i:s) {
            System.out.println(i);
        }
    }
}
