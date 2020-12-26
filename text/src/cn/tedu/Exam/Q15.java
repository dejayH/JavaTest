package cn.tedu.Exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//15，写一个方法，可以实现输出一个验证码。
// 即4个随机字母组成的字符串，例如AGQR，JJZY...并在程序入口中调用此方法。
public class Q15 {
    public static void main(String[] args) {
        String ran = "ABCDEFGHIJKLNMOPQRSTUVWXYZabcdefghijklnmopqrstuvwxyz123456789";
        String t = "";
        for (int i = 0; i < 4; i++) {//生成验证码
            int rand = new Random().nextInt(ran.length());
            t = t+ran.charAt(rand);
        }
        System.out.println("请输入验证码:"+t);
        Scanner sca = new Scanner(System.in);
        String input = sca.next();
        if(input.equalsIgnoreCase(t)){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }

    }
}
