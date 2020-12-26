package cn.tedu.util;

import java.util.HashMap;
import java.util.Scanner;

//map 的练习
public class Test2Map {
    public static <Char> void main(String[] args) {
        //统计字符串中的字符个数
        System.out.println("请输入字符串:");
        String input = new Scanner(System.in).next();
        HashMap<Character, Integer> ha = new HashMap();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            Integer value = ha.get(key);
            if(value == null){
                ha.put(key,1);
            }else {
                ha.put(key,value+1);
            }
//            ha.merge(key, 1, Integer::sum);
        }
        System.out.println(ha);


    }
}
