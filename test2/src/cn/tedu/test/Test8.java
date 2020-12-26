package cn.tedu.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
//        3.2机票价格按照淡季旺季、头等舱和经济舱收费、
//        输入机票原价、月份和头等舱或经济舱，
//        其中旺季（5-10月）头等舱9折，经济舱85折，
//        淡季（11月到来年4月）头等舱7折，经济舱65折，
//        最终输出机票价格
        System.out.println("啥时候坐?");
        int month = new Scanner(System.in).nextInt();
        double[] pri = method(month);
        System.out.println("有钱不?");
        int d = new Scanner(System.in).nextInt();
        System.out.println("打"+pri[d-1]+"折");
    }

    private static double[] method(int month) {
        double[] d = {7, 6.5};
        if (month >= 5 && month <= 10) {
            d[0] = 9;
            d[1] = 8.5;
        }
        return d;
    }
}
