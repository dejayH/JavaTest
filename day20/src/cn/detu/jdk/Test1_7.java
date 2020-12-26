package cn.detu.jdk;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test1_7 {
    public static void main(String[] args) {
        method();
        method2();
        method3();
    }

    private static void method3() {
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(""))){

        }catch (Exception e){
            System.out.println("gun");
        }
    }

    private static void method2() {
        try(InputStream in = new FileInputStream(""))
        {
            int data = in.read();
        }catch (Exception e){
            System.out.println("出现错误");
        }
    }

    private static void method()  {
        InputStream in ;
        BufferedInputStream input = null;
        try{
            in =  new FileInputStream("");
            input = new BufferedInputStream(in);
            int data = input.read();
        }catch (Exception e){
            System.out.println("数据读取失败");
        }finally{
            try{
                input.close();
            }catch (IOException i){
                System.out.println("输出错误");
            }

        }
    }
}
