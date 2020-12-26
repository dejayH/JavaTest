package cn.tedu.api;

import java.io.*;

public class Text2In {
    public static void main(String[] args) throws IOException {
//        methon();//FileInterputStream读取数据读取流
        methon2();//BufferedInputStream读取流

    }

    private static void methon2() throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\JAVA\\Desktop\\笔记\\day13\\读取流的区别.png");
        in = new BufferedInputStream(in);
        int data = 0;
        long after = System.currentTimeMillis();
        long sum = 0;
        while ((data = in.read()) != -1) {
            System.out.print(data+",");
            sum += data;
        }
        long before = System.currentTimeMillis();
        long time = before - after;
        System.out.println("运行时间为:" + time+","+sum);
        in.close();
    }

    private static void methon() throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\JAVA\\Desktop\\笔记\\doc\\01-05.htm");
        int data = 0;
        long after = System.currentTimeMillis();
        while ((data = in.read()) != -1) {
//            System.out.println(data);
        }
        long before = System.currentTimeMillis();
        long time = before - after;
        System.out.println("运行时间为:" + time);
        in.close();
        //TODO 释放完资源就不能读了
    }
}
