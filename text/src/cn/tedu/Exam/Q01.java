package cn.tedu.Exam;

import java.util.Random;

//1，声明一个数组，长度为10，并为其赋值，其值都是20-80之间的随机数。
public class Q01 {
    public static void main(String[] args) {
        int[] i  = new int[10];
        Random ran = new Random();
        for (int j = 0; j < i.length; j++) {
            i[j] = ran.nextInt(60)+20;
        }
        for(int j : i){
            System.out.println(j);
        }
    }

}
