package cn.tedu.test;

public class Test9 {
    public static void main(String[] args) {
//        5.1有一个有钱的神经病，他往银行里存钱，
//        第一天存1元,以后每天比前一天多存50%，完成下列计算任务
//        1)他存到第几天，当天存的钱会超过10元
//        2)一个月（30天）后，他总共存了多少钱
        double i = 1;
        int num = 1;
        while (i < 10) {
            i *= 1.5;
            num++;
        }
//        System.out.println(num);
        for (; num < 30; num++) {
            i *= 1.5;
        }
        System.out.println((int)i);
    }


}
