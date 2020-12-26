package cn.tedu.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//测试 List接口的方法
public class Text4List {
    public static void main(String[] args) {
        //1,创建多态对象
        //TODO 泛型用来约束集合里的类型,只能写引用类型
        List<Integer> l = new ArrayList();
        //2,调用方法
        l.add(1);
        l.add(2);
        l.add(null);
        l.add(3);
        l.add(2);
        l.add(4);
        l.add(null);
        l.add(1);
        //特点:有序+可重复+可以存多个null+有索引
        System.out.println(l);

        //TODO 自己拓展的--根据索引操作数据
        l.add(2,700);//在下标2处插入700
        System.out.println(l);
        System.out.println(l.get(2));//根据下标获取元素
        System.out.println(l.indexOf(1));//获取元素1,第一次出现的索引值
        System.out.println(l.lastIndexOf(1));//获取元素1,最后一次出现的索引值
        System.out.println(l.remove(3));//移除下标为3的元素
        System.out.println(l.set(4,55));//把下标为4的元素,替换成55
        System.out.println(l);
        List<Integer> l2 = l.subList(1, 5);
        System.out.println(l2);
        //TODO 迭代list集合
        //方法1:继承来的Iterator<E> iterator()
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            Integer i = it.next();
//            System.out.println(i);
        }
        //方法2:自己扩展的ListIterator<E> listIterator()
        ListIterator<Integer> in2 = l.listIterator();
        while (in2.hasNext()){
            Integer in = in2.next();
            System.out.print(in+",");
        }
        System.out.println();
        while (in2.hasPrevious()){//逆向迭代--必须先正向迭代
            Integer data = in2.previous();
            System.out.print(data+",");
        }
        System.out.println();
        //方法3:根据下标迭代
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+",");
        }
        System.out.println();

        //方法4:增强for循环/foreach循环
        for (Integer i : l) {
            System.out.print(i+":");
        }


    }
}
