package cn.tedu.Exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//12.春晚有10位明星，出场顺序未定，于是用抽签来决定出场顺序，
// 请写代码模拟抽签。最终输出以下格式的内容：第1位出场的是XXX，第2位出场的是XXX...
public class Q12NK {
    public static void main(String[] args) {
        String[] s = {"周杰伦","林俊杰","五月天","邓紫棋","霉霉","Justin","A神","汪苏泷","周笔畅","毛不易"};
        List list = new ArrayList();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            Random ran = new Random();
            int ra = ran.nextInt(10-i);
            if((i+1) % 5 == 0){
                System.out.println("第"+ (i+1) +"个出场的是:"+list.get(ra));
            }else {
                System.out.print("第" + (i+1) + "个出场的是:" + list.get(ra) + ",");
            }
            list.remove(ra);
        }
    }
}
