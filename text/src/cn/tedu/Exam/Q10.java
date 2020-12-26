package cn.tedu.Exam;

import java.util.Scanner;

//10，写一个方法，该方法接收一个int作为参数，具体值由用户从控制台输入。该方法可以实现：输出它是一个几位数。
// 例如用户输入的是9527,程序会输出“9527是一个4位数”
public class Q10 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        int in = new Scanner(System.in).nextInt();
        int n = 0;
        int out = in;
        while (in != 0){
            in /= 10;
            n++;
        }
        System.out.println(out+"是一个"+n+"位数");
    }
}
