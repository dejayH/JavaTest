package cn.tedu.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//测试日期格式化工具类
public class Text4SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        method();
        method2();
    }

    private static void method2() throws ParseException {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sim.parse(new Scanner(System.in).next());
        long dat = d.getTime();//出生的毫秒值
        long now = System.currentTimeMillis();
        System.out.println((now-dat)/1000/60/60/24);

    }

    public static void method() throws ParseException {
        //1,创建对象
        SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd ");
        //2,调用方法
        Date d = da.parse(new Scanner(System.in).next());
        //好处是:使用Date的getxx()
        System.out.println(d.getMonth()+1);
    }
}
