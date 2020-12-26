package cn.tedu.api;

import java.io.*;

public class Text3Out {
    public static void main(String[] args) throws IOException {
        method();
        method2();
    }

    private static void method2() throws IOException {
        OutputStream out = new BufferedOutputStream(
                            new FileOutputStream("D:\\iotext\\10.txt",true));
        out.write("都是骗人的".getBytes());
        out.close();
    }

    //普通流写出
    private static void method() throws IOException {
        OutputStream out = new FileOutputStream("D:\\iotext\\55.txt",true);
        out.write("不是开玩笑".getBytes());
        out.close();
    }
}
