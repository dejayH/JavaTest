package cn.tedu.api;

import java.io.*;
import java.util.Scanner;

public class Text1Copy {
    public static void main(String[] args) throws IOException{
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入源文件路径:");
        String in = sca.next();
        System.out.println("请输入目标文件路径:");
        String out= sca.next();
        method(in,out);
        System.out.println("文件已复制完成");
    }

    private static void method(String in, String out) throws IOException {
        InputStream input = new BufferedInputStream(new FileInputStream(in));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(out,true));
        int b = 0;
        while (( b= input.read()) != -1){
            output.write(b);
        }
        input.close();
//        output.flush();//刷新
        output.close();//flash + close
    }
}
