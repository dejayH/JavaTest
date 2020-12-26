package cn.tedu.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
//        2.1商场消费返利活动，手动输入顾客消费金额，
//        如果金额打8折后仍然满1000元，用户就获得200元代金券一张（不考虑多张）
        double v = new Scanner(System.in).nextDouble();
        String s = v*0.8>1000?"获得200元代金券一张":"";
        System.out.println("消费金额为:"+v*0.8+"元."+s);

    }
}
