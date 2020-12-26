package cn.tedu.weektest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        从键盘获取一行输入字符串，要求去除重复字符。
        method();
    }

    private static void method() {
        String s = new Scanner(System.in).nextLine();
        List<Character> li = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            if(!(li.contains(s.charAt(i)))){
                li.add(s.charAt(i));
            }
        }
        for(Character i : li){
            System.out.print(i);
        }

    }
}
