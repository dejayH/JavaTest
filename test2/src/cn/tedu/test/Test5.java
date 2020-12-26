package cn.tedu.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        2.3手动输入一个整型会员号，
//        如果用户输入的是4位数字，
//        输出登录成功，
//        如果用户输入的不是4位数字,
//                输出“您输入的会员号有误”
        String re = method();
        System.out.println(re);
    }

    private static String method() {
        int i = new Scanner(System.in).nextInt();
        if(i/1000<10 && i/1000>0){
            return "登录成功";
        }
        return "登录失败";
    }
}
