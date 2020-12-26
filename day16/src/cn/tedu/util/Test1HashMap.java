package cn.tedu.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//测试 HashMap
public class Test1HashMap {
    public static <Ineeger> void main(String[] args) {
        HashMap<Integer,String> h = new HashMap();
        h.put(1,"gost");
        h.put(2,"drive");
        h.put(3,"zero");
        System.out.println(h);
        System.out.println(h.hashCode());
        //迭代
        for(Integer i : h.keySet()){
            String val = h.get(i);
            System.out.print(i+val+",");
        }
        System.out.println();

        for(String i : h.values()){
            System.out.print(i+",");
        }
        System.out.println();
        Set<Map.Entry<Integer, String>> e = h.entrySet();
        for(Map.Entry<Integer, String> i : e){
            Integer key = i.getKey();
            String  values = i.getValue();
            System.out.print(key+values+",");
        }
        System.out.println();
    }
}
