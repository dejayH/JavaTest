package cn.tedu.util;

import java.util.LinkedList;
import java.util.List;

public class Test2LinkedList {
    public static void main(String[] args) {
        // 1,创建对象
        LinkedList<String> l= new LinkedList();
        // 2,调用方法
        //TODO 继承自上层接口
        l.add("zero");
        l.add("时王");
        l.add("GOST");
        l.add("driver");

        //自己扩展的
        l.addFirst("bulid");
        l.addLast("帝骑");
        System.out.println(l);
//        System.out.println(l.getFirst());
//        System.out.println(l.getLast());
//        System.out.println(l.removeFirst() );
//        System.out.println(l.removeLast());
        //2,两套操作方法,效果一样
        l.offerFirst("clid");
        l.offerLast("龙骑");
        System.out.println(l);
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());
        System.out.println(l.pollFirst());
        System.out.println(l);
        System.out.println(l.pollLast());


    }
}
