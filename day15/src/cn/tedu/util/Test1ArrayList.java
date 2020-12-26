package cn.tedu.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//测试 ArrayList
public class Test1ArrayList {
    public static void main(String[] args) {
        //1,创建对象
        ArrayList l = new ArrayList();
        //2,调用对象
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(2);
        l.add(null);
        l.add(6);
        l.add(4,1);
        System.out.println(l);
        //TODO 迭代list集合的4种方式
        //1,
        Iterator<Integer> i = l.iterator();
        while ( i.hasNext()){
            System.out.print(i.next()+",");
        }
        System.out.println();
        //2,
        ListIterator<Integer> li = l.listIterator();
        while (li.hasNext()){
            System.out.print(li.next()+",");
        }
        System.out.println();
//        while (li.hasPrevious()){
//            System.out.print(li.previousIndex()+",");
//        }
//        System.out.println();
        //3,
        for (int j = 0; j < l.size(); j++) {
            System.out.print(l.get(j)+",");
        }
        System.out.println();
        //4,
        for (Object o: l ) {
            System.out.print(o+",");
        }

    }
}
