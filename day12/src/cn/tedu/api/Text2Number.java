package cn.tedu.api;

import java.sql.SQLOutput;

public class Text2Number {
    public static void main(String[] args) {
        //1,创造Integer对象--自动装箱
        //把20从基本类型变成Integer类型
        Integer in = new Integer(20);
        Integer in1 = new Integer(20);
        System.out.println( in==in1 );
        Integer in2 = Integer.valueOf(20);
        Integer in3 = Integer.valueOf(20);
        System.out.println( in2==in3 );
        Double dou = Double.valueOf(20.1);
        Double dou1 = dou.doubleValue();
        //TODO 2,调用方法
//        把包装类变成基本类型 --自动拆箱 - 参与运算
        int a = in.intValue();
        System.out.println(a);

        int i = Integer.parseInt("100");//把一个字符串类型的整数 解析成int类型
        System.out.println(i);


    }

}
