package cn.tedu.test;

public class Test10 {
    public static void main(String[] args) {
//        5.2有一个400米一圈的操场，一个人要跑10000米，
//        第一圈50秒，其后每一圈都比前一圈慢1秒，
//        按照这个规则计算跑完10000米需要多少秒
        int t = 50;
        int max = 10000;
        int time = 0;
        while (max >= 0) {
            max -= 400;
            time += t++;
        }
        System.out.println("花了"+time+"秒."+t);
    }
}
