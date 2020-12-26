package cn.tedu.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
//        2.4手动输入a，b，c三个变量的数值，
//        要求通过数值交换，
//        把输入的数值从小到大
//        排序放入a,b,c中，并输出
        Scanner sca = new Scanner(System.in);
        int[] i = new int[3];
        for (int j = 0; j < i.length; j++) {
            i[j] = sca.nextInt();
        }
        for (int j = 0; j < i.length-1; j++) {
            for (int k = 0; k < i.length-1; k++) {
                if(i[j]>i[j+1]){
                    int d = i[j];
                    i[j] = i[j+1];
                    i[j+1] = d;
                }
            }
        }
        for(int j : i){
            System.out.print(j+",");
        }

    }

}
