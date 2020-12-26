package cn.tedu.api;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//测试 字符串
public class Test3String {
    public static void main(String[] args) {
        String s = new String();
        char[] value = {'h', 'e', 'l', 'l', 'o'};
        String s2 = new String(value);

        System.out.println(s2.charAt(1));//判断下标1对应的字符
        System.out.println(s2.concat("ing"));//在s2后面拼接ing
        System.out.println(s2.contains("el"));//判断在s2里有没有"el"
        System.out.println(s2.endsWith("lo"));//判断s2是不是以"ol"结尾
        System.out.println(s2.equals("hell"));//判断s2与"hell"相不相等
        System.out.println(s2.getBytes());//把s2储存成byte数组
        System.out.println(s2.hashCode());//获取s2在内存中的地址值

        System.out.println(s2.indexOf("l"));//"l"在s2第一次出现的索引值
        System.out.println(s2.isEmpty());//s2是否为空
        System.out.println(s2.lastIndexOf("l"));//"l"在s2最后一次出现的索引值
        System.out.println(s2.length());//s2的长度
        System.out.println(s2.replace('l', 'a'));//用新字符替换旧字符
        System.out.println(s2.startsWith("he"));//s2是否以"he"结束
        System.out.println(s2.substring(2));//从2索引开始截取字符串
        System.out.println(s2.substring(2, 4));//从2索引开始,到4索引结束截取字符串--含头不含尾
        System.out.println(s2.toLowerCase());//全小写
        System.out.println(s2.toUpperCase());//全大写
        System.out.println(s2.toString());//打印属性值
        System.out.println(s2.trim());//去除前面和后面的多余空格
        System.out.println(String.valueOf(100) + 1);//把各种类型的数据转场String类型
        System.out.println(s2.toCharArray());//把s2的每个字符,存入Char数组
        byte[] bs = s2.getBytes();//把s2里的每个字符对应的整数存入byte[]
        System.out.println(Arrays.toString(bs));

        s2 = "a1b1c1d1e1f1";
        String[] strs = s2.split("1");//按照指定规则切割字符串
        System.out.println(Arrays.toString(strs));

        //TODO 练习:接收用户输入的字符串,打印每个字符
        String in =  new Scanner(System.in).next();
        for (int i = 0; i < in.length(); i++) {
            char out = in.charAt(i);
            System.out.println(out);
        }
    }
}
