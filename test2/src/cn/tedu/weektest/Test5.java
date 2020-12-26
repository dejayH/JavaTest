package cn.tedu.weektest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        编写程序，获取命令行参数中的字符串列表，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表。
        List<Character> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        String s = new Scanner(System.in).nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(!(list.contains(s.charAt(i)))){
                list.add(s.charAt(i));
            }else{
                list2.add(s.charAt(i));
            }
        }


    }
}
