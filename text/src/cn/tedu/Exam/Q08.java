package cn.tedu.Exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//8，写一个方法，可以实现拆分数组的功能。它接收一个数组作为参数，把接收到的数组拆分成两个数组，
// 一个数组放奇数，一个数组放偶数。并在该方法中用一个for循环输出偶数数组的每一个成员。
public class Q08 {
    public static void main(String[] args) {
        int[] in = input();
//        int[] in = rand();
        int[] even = new int[0];
        int[] odd = new int[0];
        int eve = 0;
        int od = 0;
        for(int i = 0 ; i < in.length ;i++){
            if(in[i] % 2 == 0){
                if(eve == even.length){//每多一个偶数就偶数数组长度加一
                    even = Arrays.copyOf(even,even.length+1);
                }
                even[eve++] = in[i];
            }else if(in[i] % 2 == 1){
                if(od == odd.length){//每多一个奇数就奇数数组长度加一
                    odd = Arrays.copyOf(odd,odd.length+1);
                }
                odd[od++] = in[i];
            }
        }
        for(int i : even){
            System.out.println(i);
        }

    }

    private static int[] rand() {
        int[] in = new int[10];
        for (int i = 0; i < in.length; i++) {
            in[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(in));
        return in;
    }

    private static int[] input() {
        System.out.println("请输入十个整数数:");
        int[] in = new int[10];
        for (int i = 0; i < in.length; i++) {
            in[i] = new Scanner(System.in).nextInt();
        }
        return in;
    }
}
