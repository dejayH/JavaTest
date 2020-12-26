package cn.tedu.api;

import java.io.File;

public class Text1File {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        File file = new File("F:\\waste\\tag\\steamapps");
        long size = method(file);
        System.out.println("文件的大小为:"+(size/1024/1024)+"M,即"+(size/1024/1024/1024)+"G");
    }

    //TODO 统计文件夹里文件的总大小

    private static long method(File files) {
//        File file = new File("F:\\waste\\tag\\steamapps");
        File[] fi = files.listFiles();
        long sum = 0;
        for (int i = 0; i < fi.length; i++) {
            File f = fi[i];
            if (f.isFile()) {
                sum += f.length();
            }else if(f.isDirectory()){
                sum += method(f);
            }
        }
        return sum;

    }
}
