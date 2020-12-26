package cn.tedu.text;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        System.out.println("输入要删除的文件路径:");
        String in = new Scanner(System.in).next();
        File dir = new File(in);
        del(dir);
        System.out.println("删除成功.");

    }

    private static void del(File dir) {
        File[] f = dir.listFiles();
        for (File i : f) {
            if(i.isFile()){
                i.delete();
            }else if (i.isDirectory()) {
                del(i);
            }
            i.delete();
        }
    }
}
