package cn.tedu.weektest;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

public class Test6 {
    public static void main(String[] args) {
//        使用Scanner从控制台读取一个字符串，统计字符串中每个字符出现的次数
        Map<Character,Integer> map = new HashMap();
        String in = new Scanner(System.in).next();
        char[] ch = new char[in.length()];
        for (int i = 0; i < in.length(); i++) {
            ch[i] = in.charAt(i);
        }

        for (char c : ch) {
            if(map.containsKey(c)){
                    Integer value = map.get(c);
                    value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        for(Character key : map.keySet()){
            System.out.println(key+"出现了"+map.get(key)+"次");
        }
    }
}
