package cn.tedu.util;

import java.util.*;

//测试 collection接口
public class Text3Collection {
    public static void main(String[] args) {
        //1,创建多态对象测试
        Collection c = new ArrayList();
        //2,调用方法
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c);
        System.out.println(c.contains(2));//是否包含
        System.out.println(c.equals(1));//是否相等
        System.out.println(c.hashCode());//哈希码值
        System.out.println(c.isEmpty());//是否为空
        System.out.println(c.remove(3));//移除3
        System.out.println(c.size());//长度
//        c.clear();//清空所有元素
//        System.out.println(c.size());
        Object[] os = c.toArray();
        System.out.println(Arrays.toString(os));
        //TODO 集合间的操作--了解
        Collection c2 = new ArrayList();
        c2.add(2);
        c2.add(3);
        System.out.println(c2);
        System.out.println(c.addAll(c2));//把c2加入到c里面
//        System.out.println(c.contains(c2));//c里面包含c2吗
//        System.out.println(c.remove(c2));
//        System.out.println(c.retainAll(c2));
        System.out.println(c);
        //TODO 迭代集合--一个一个获取集合里的元素
        Iterator it = c.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

        for (Object i: c) {
            System.out.println(i);
        }


    }
}
