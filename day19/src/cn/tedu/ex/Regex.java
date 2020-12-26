package cn.tedu.ex;

import java.util.Scanner;

//拓展1:正则表达式
public class Regex {
    public static void main(String[] args) {
        //规定一个规则regex String.matches(regex)
        //接收用户输入的一个手机号码,判断格式是否正确
        String tel = new Scanner(System.in).nextLine();
        String regex ="[1][0-9]{10}";
        if(tel.matches(regex)){
            System.out.println("给爷麻溜的滚");
        }else{
            System.out.println("给爷爬");
        }

        //身份证
         String id = new Scanner(System.in).nextLine();
        String re = "[0-9]{17}[0-9X]";
        if(id.matches(re)){
            System.out.println("还算对");
        }else{
            System.out.println("错了都错了");
        }

    }
}
