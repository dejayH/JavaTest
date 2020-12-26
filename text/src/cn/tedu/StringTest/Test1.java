package cn.tedu.StringTest;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//        1.先随机生成4个字符组成的验证码有大小写混合组成,生成一个字符串并输出,
//            然后可以输入字符串进行验证比较,然后成功后输出,登陆成功,否则登陆失败.
        String ran = mothod();
        System.out.println("请输入验证码:"+ran+"(不区分大小写)");
        mothod2(ran);

    }

    private static void mothod2(String ran) {
        String input = new Scanner(System.in).next();
        ran = ran.toLowerCase();
        input = input.toLowerCase();
        if(input.equals(ran)){
            System.out.println("验证码输入正确");
        }else{
            System.out.println("验证码输入错误");
        }
    }

    private static String mothod() {
        String ran = "";
        String s = new String("ABCDEFGHIJKLNMOPQRSTUVWXYZabcdefghijklnmopqrstuvwxyz123456789");
        for(int i = 0;i < 4;i++){
            int j = (int) (Math.random()*s.length());

            ran = ran+s.charAt(j);;
        }
        return ran;
    }
}
