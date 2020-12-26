package cn.tedu.Exam;

import java.util.Arrays;
import java.util.Random;

//9，写一个方法，可以实现合并数组的功能。该方法接收两个数组作为参数，
// 并把两个数组合并成一个，并返回给调用者，调用者输出合并后的数组中的每一个成员。
public class Q09 {
    public static void main(String[] args) {
        int[] o1 = ran();
        int[] o2 = ran();
        int[] out = new int[o1.length+o2.length];
        for (int i = 0; i < o1.length; i++) {
            out[i] = o1[i];
        }
        for (int i = 0; i < o2.length; i++) {
            out[i+o1.length] = o2[i];
        }
        for(int i : out){
            System.out.println(i);
        }

    }

    private static int[] ran() {
        int[] i = new int[10];
        for (int j = 0; j < i.length; j++) {
            i[j] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(i));
        return i;
    }
}
