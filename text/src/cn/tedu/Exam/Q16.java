package cn.tedu.Exam;

import java.util.Scanner;

//女生给男生打电话：下班回来时买5个包子，如果看到卖西瓜的，就买一个。
// 男生回来后，拿着一个包子。女生问：为什么只买一个包子，男生说：我看到了卖西瓜的。请尝试用代码表示男生的心路历程。
public class Q16 {
    public static void main(String[] args) {
        int buy = 5;
        System.out.println("有没有见到卖西瓜的");
        String wa = new Scanner(System.in).next();
        if (wa.equals("有")){
            buy = 1;
        }else if(wa.equals("没有")){
            buy = 5;
        }else{

        }
        System.out.println("买了"+buy+"个包子");

    }
}
