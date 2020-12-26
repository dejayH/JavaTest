package cn.tedu.test;

public class Test11 {
    public static void main(String[] args) {
//        5.4井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
//                计算蜗牛需要多少天才能从井底到爬出来
        double h = 56.7;
        int day = 1;
        while (h >= 0) {
            h -= (5 + 3.5);
            day++;
            System.out.println(h);
        }
        System.out.println(day);
    }
}
