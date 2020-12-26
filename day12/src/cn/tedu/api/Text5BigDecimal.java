package cn.tedu.api;

import java.math.BigDecimal;
import java.util.Scanner;

//测试
public class Text5BigDecimal {
    public static void main(String[] args) {
//        method();
//        method2();
        method3();
    }

    private static void method3() throws ArithmeticException{
        double a1 = new Scanner(System.in).nextDouble();
        double a2 = new Scanner(System.in).nextDouble();
        BigDecimal s1 = new BigDecimal(a1+"");
        BigDecimal s2 = new BigDecimal(a2+"");
        BigDecimal s3 = s1.add(s2);
        System.out.println(s3);
        s3 = s1.subtract(s2);
        System.out.println(s3);
        s3 = s1.multiply(s2);
        System.out.println(s3);
        s3 = s1.divide(s2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println(s3);
    }

    private static void method2() {
        double a1 = new Scanner(System.in).nextDouble();
        double a2 = new Scanner(System.in).nextDouble();
        BigDecimal s1 = new BigDecimal(a1);
        BigDecimal s2 = new BigDecimal(a2);
        System.out.println(s1.add(s2));
        System.out.println(s1.subtract(s2));
        System.out.println(s1.multiply(s2));
        System.out.println(s1.divide(s2));
    }

    private static void method() {
        System.out.println(6.8 + 1.9);
        System.out.println(6.8 - 1.9);
        System.out.println(6.8 * 1.9);
        System.out.println(6.8 / 1.9);
    }
}
