package cn.tedu.Exam;

import java.util.Scanner;

//写一个方法，该方法接收一个int作为参数，具体值由用户从控制台输入。
// 该方法可以实现：输出“xxx是一个n位数，它的每一位分别是x,x,x,x”。
// 例如用户输入的是9527,程序会输出“9527是一个4位数，它的每一位分别是9，5，2，7”
public class Q17 {
    public static void main(String[] args) {

        System.out.println("请输入一个正数");
        Scanner sca = new Scanner(System.in);
        int i = sca.nextInt();
        int ti = i;
        int num = 0;
        String k = "";
        while (i != 0){
            if(i % 10 != 0){
                num++;
                k = k + (i % 10);
                i = i / 10;
            }else{
                break;
            }
        }
        System.out.print(ti+"是个"+num+"位数,他的每一位数分别是:");
        for (int j = 0; j < k.length(); j++) {
            if(k.length()-1-j == 0){
                System.out.println(k.charAt(0));
            }else{
                System.out.print(k.charAt(k.length()-1-j)+",");
            }
        }
    }
}
