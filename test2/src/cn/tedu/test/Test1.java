package cn.tedu.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//        1.1手动输入一个学生的成绩，对这个成绩进行一次加分，加当前成绩的20%，输出加分后成绩
        Scanner sca = new Scanner(System.in);
        int i = sca.nextInt();
        i *= 1.2;
        System.out.println(i);
    }
}
