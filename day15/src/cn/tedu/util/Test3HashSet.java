package cn.tedu.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3HashSet {
    public static void main(String[] args) {
        //1,创建对象
        HashSet<String> set = new HashSet();
        //2,调用方法
        set.add("Tony");
        set.add("Tom");
        set.add("Jarry");
        set.add("Jarry");
        set.add("y");
        set.add("Tom");
        set.add("Tom");
        set.add("Sidy");
        set.add("y");
        System.out.println(set);
        set.contains("y");

        //TODO 迭代
        //方式1:Iterator<E> iterator()
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.print(o+",");
        }
        System.out.println();
        //方法2:foreach
        for (String s : set) {
            System.out.print(s+",");
        }
        System.out.println();
    }
}
