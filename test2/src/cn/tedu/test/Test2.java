package cn.tedu.test;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        1.2商场举行店庆，抽几折打几折，
//        先手动输入消费金额，再输入，抽到的折扣，计算出折后价格
        double v = new Scanner(System.in).nextDouble();
        int i = new Random().nextInt(10)+1;
        System.out.println("抽中的折扣为"+i+"折,最终价格为:"+i*0.1*v);

    }
}
