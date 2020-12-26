package cn.tedu.api;

import java.util.Date;

//测试 Date工具类
public class Text3Date {
    public static void main(String[] args) {
        //1,创建对象
        Date d = new Date();
        //2,调用方法
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getMonth());
        System.out.println(d.getSeconds());
        System.out.println(d.getClass());
        System.out.println(d.toLocaleString());
        //从1900到如今的隔了多少年
        System.out.println(d.getYear());

    }
}
