package cn.tedu.Exam;

import java.util.Arrays;

//7，某次小游戏开发大赛有10位评委老师，打分都在6-10分之间（随机）。去掉一个最高分和一个最低分，剩余分数的平均分即为该作品的最终得分，请写代码实现。
public class Q07 {
    public static void main(String[] args) {
        int[] give = new int[10];
        for (int i = 0; i < 10; i++) {
            int score = (int)(Math.random()*5+6);
            give[i] = score;
        }
        for (int i = 0; i < give.length-1; i++) {
            for (int j = 0; j < give.length-1; j++) {
                if(give[j] > give[j+1]){
                    int t = give[j];
                    give[j] = give[j+1];
                    give[j+1] = t;
                }
            }
        }
        int sum = 0;
        for (int i = 1; i < give.length-1; i++) {
            sum += give[i];
        }
        System.out.println("最终的平均分为:"+sum/8);

    }

}
