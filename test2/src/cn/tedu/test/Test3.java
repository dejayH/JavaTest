package cn.tedu.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        1.3手动输入一个4位数，求各位数字之和
        int i = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int j = 0; j < 10; j++) {
            sum = sum+i%10;
            i = i/10;
        }
        System.out.println(sum);
    }
}
