package cn.tedu.StringTest;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
//        5. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
//        “To be or not to be"，将变成"oT eb ro ton ot eb."。
        String s= "To be or not to be";
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        int us = 0;
        for(String i : str){
            String[] fi = new String[i.length()];
            for (int j = 0; j < i.length(); j++) {
                fi[j] = String.valueOf(i.charAt(i.length()-1-j));
            }
            String out = "";
            for(String j : fi){
                out = out+j;
            }
            str[us++] = out;
        }
        System.out.println(Arrays.toString(str));
        for(String j : str){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
