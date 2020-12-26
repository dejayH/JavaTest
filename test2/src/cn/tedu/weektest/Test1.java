package cn.tedu.weektest;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
//        一.生成10个1到20之间的不重复的随机数
        List<Integer> out = new ArrayList();
        while (out.size() < 10) {
            int ra = new Random().nextInt(20) + 1;
            if (!(out.contains(ra))) {
                out.add(ra);
            }
        }
        System.out.println(out);
    }
}
