package cn.tedu.test;

import java.io.*;
import java.util.*;

public class text1 {
    public static void main(String[] args) throws IOException{
        System.out.println("请输入目标路径:");
        String inth = new Scanner(System.in).next();
        List<Integer> l =mothod(inth);
        mothod2(l);
        mothod3(l);
        mothod4(l);

    }

    private static void mothod4(List<Integer> l) {
        List<Integer> li = new ArrayList();
        for (Integer o : l) {
            if (!li.contains(o)){
                li.add(o);
            }
        }
        for(Integer o : li){
            System.out.print(o+",");
        }

    }

    private static void mothod3(List<Integer> l) {
        Set<Integer> a=  new HashSet();
        for(int i = 0;i<l.size();i++){
            a.add(l.get(i));
        }
        for(Integer o : a){
            System.out.print(o+",");
        }
        System.out.println();
    }

    private static void mothod2(List<Integer> l) {
        for (Integer o : l ) {
            System.out.print(o+",");
        }
        System.out.println();
    }


    private static List<Integer> mothod(String input) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(input));
        List<Integer> l = new ArrayList();
        int i =0;
        while((i = in.read()) != -1) {
             l.add(i);
        }
        in.close();
        return l;

    }
}
