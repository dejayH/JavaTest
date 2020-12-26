package cn.tedu.api;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//测试 File文件流
public class Text6File {
    public static void main(String[] args) throws IOException {
        //1,创建对象
        File file = new File("D:\\iotext\\1.txt");
        //2,调用方法


        System.out.println(file.length());//获取文件大小
        System.out.println(file.exists());//判断是否存在
        System.out.println(file.isDirectory());//判断是否文件夹
        System.out.println(file.isFile());//判断是否文件
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//获取父路径
        System.out.println(file.getAbsolutePath());//获取完整路径

        //TODO
        file = new File("D:\\iotext\\2.txt");
        System.out.println(file.createNewFile());//创建文件
        file = new File("D:\\iotext\\sili");
        System.out.println(file.mkdir());//新疆文件夹
        file = new File("D:\\iotext\\a\\b\\c");
        System.out.println(file.mkdirs());
        System.out.println(file.delete());//删除文件夹
        file = new File("D:\\iotext");
        //把文件名列出来
        System.out.println(Arrays.toString(file.list()));
        //把所有资源列出来,并封装成file对象存入File[]
        File[] fs = file.listFiles();
        System.out.println(Arrays.toString(fs));

        //TODO 练习:获取指定文件夹里所有资源的名称
        File game = new File("F:\\waste\\tag\\steamapps");
        File[] files = game.listFiles();
        for (int i = 0; i < files.length; i++) {
            File fi = files[i];
            if (fi.isFile()) {
                System.out.println(fi.getName());
            } else if (fi.isDirectory()) {
                System.out.println(fi.getName());
            }
        }

    }
}
