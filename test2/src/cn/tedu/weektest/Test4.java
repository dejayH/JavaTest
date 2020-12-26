package cn.tedu.weektest;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<String> list = list();
        List<String> push = push(list);
        System.out.println(push);
    }
    //冒泡排序
    private static List<String> push(List<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1; j++) {
                String s = list.get(j);
                String s1 = list.get(j + 1);
                if(s.length()>s1.length()){
                    String re = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,re);
                }
            }
        }
        return list;
    }


    //添加数据
    private static List<String> list() {
        List<String> list = new ArrayList();
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");
        return list;
    }
}
