package cn.tedu.Exam;

import java.util.Scanner;

//14.写一个方法，能够实现数组反序器的功能，也就是你传一个数组参数给它，它返回一个反序数组给你，
// 例如你传的是{3,9,4,2},它返回的是{2,4,9,3}。
public class Q14 {
    public static void main(String[] args) {
        int[] in = method();
        int[] out =method2(in);
        for(int i : out){
            System.out.println(i);
        }
    }

    private static int[] method2(int[] i) {//将数组倒装
        int[] j = new int[i.length];
        for (int k = 0; k < j.length; k++) {
            j[k] = i[i.length-k-1];
        }
        return j;
    }

    private static int[] method() {
        Scanner sca = new Scanner(System.in);
        System.out.println("随便输入5个整数:");
        int[] in = new int[5];
        for (int i = 0; i < in.length; i++) {
            in[i] = sca.nextInt();
        }
        return in;
    }
}
