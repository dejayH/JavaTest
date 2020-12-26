package cn.tedu.Exam;

import java.util.Scanner;

//11，写一个方法，可以实现求m的n次方的功能。该方法名叫pow，
// 接收两个int型的参数m和n，求m的n次方。在程序入口中调用此方法。
public class Q11 {
    public static void main(String[] args) {
        System.out.println("请输入m,n");
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int out = pow(m,n);
        System.out.println(out);
    }

    public static int pow(int m,int n) {
        int out = 1;
        for (int i = 0; i < n; i++) {
            out *= m;
        }
        return out;
    }
}
