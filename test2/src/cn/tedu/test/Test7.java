package cn.tedu.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
//        3.1商场根据会员积分打折，
//        2000分以内打9折，
//        4000分以内打8折
//        8000分以内打7.5折，
//        8000分以上打7折，
//        使用if-else-if结构，实现手动输入购物金额和积分，计算出应缴金额
        double price = new Scanner(System.in).nextDouble();
        double d = method(price);
        System.out.println("你猜");
    }

    private static double method(double price) {
        if(price>8000){
            return 7;
        }else if(price>4000){
            return 7.5;
        }else if(price>2000){
            return 8;
        }else if(price>0){
            return 9;
        }else{
            return 0;
        }
    }
}
