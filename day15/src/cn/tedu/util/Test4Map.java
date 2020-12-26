package cn.tedu.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4Map {
    public static <K, V> void main(String[] args) {
        //1,创建对象
        Map<Integer, String> m= new HashMap();
        //2,调用方法
        m.put(9527,"唐伯虎");
        m.put(9528,"秋香姐");
        m.put(9529,"石榴姐");

        System.out.println(m);
        System.out.println(m.get(9527));
        System.out.println(m.containsKey(9529));
        System.out.println(m.containsValue(9529));
        System.out.println(m.equals("秋香姐"));
        System.out.println(m.hashCode());
        System.out.println(m.isEmpty());
        System.out.println(m.size());
//        System.out.println(m.remove(9528));
//        System.out.println(m);

        //迭代Map集合
        Set<Integer> s = m.keySet();
        Collection<String> c = m.values();
        System.out.println(s);
        System.out.println(c);
        for(Integer i : s){
            String value = m.get(i);
            System.out.println(i+value);
        }
        //TODO entrySdt<K,V>
        Set<Map.Entry<Integer,String>> s1 = m.entrySet();
        for(Map.Entry<Integer,String> i : s1){
            i.getKey();
            System.out.println(i.getValue());
        }

        Collection<String> values = m.values();
        for (String value : values) {
            System.out.println("00"+value);
        }



    }
}
