package cn.tedu.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text2Generic {
    public static void main(String[] args) {
//        method();//类型检查
        method2();//增强通用性
    }

    private static void method2() {
        Integer[] a = {1, 2, 3, 4, 5};
        print(a);
        Double[] b = {1.1, 1.2, 1.3, 1.4, 1.5};
        print(b);
        String[] c = {"yi", "er", "san", "si","wu","liu"};
        print(c);
    }

    private static <E> void print(E[] b) {
        for (E i : b) {
            System.out.println(i);
        }
    }

//    private static void print(Double[] b) {
//        for (double i :
//                b) {
//            System.out.println(i);
//        }
//    }

//    private static void print(Integer[] a) {
//        for (int o : a) {
//            System.out.println(o);
//        }
//    }

    //类型检查
    private static void method() {
        //模拟数组:类型检查+报错前置
//        int[] a = {1,2,3,4,5};
        //集合里可以添加任意类型的元素
        List list = new ArrayList();
        list.add(12);
        list.add("1");
        list.add(10.5);
        list.add(true);

        //1,作用 约束集合里元素的类型
        List<String> list2 = new ArrayList();
        list2.add("20");
//        list2.add(100);//没有通过泛型的类型检测
        // 检查类型+提前报错

        //3,泛型的<??>--??不能是基本类型,只能是引用类型
        List<Integer> list3 = new ArrayList();
        list3.add(34);
        //自动装箱- 把基本类型变成包装类型 new Integer
        list3.add(5);
//        list3.add(2.4);
//        list3.add("143");

    }
}
