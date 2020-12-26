package cn.tedu.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//12.春晚有10位明星，出场顺序未定，于是用抽签来决定出场顺序，
// 请写代码模拟抽签。最终输出以下格式的内容：第1位出场的是XXX，第2位出场的是XXX...
public class Q12 {
    public static void main(String[] args) {
        int[] li = ran();
        for (int i = 0; i < li.length; i++) {
            String person = person(li[i]);
            System.out.println("第" + (i + 1) + "位出场的是:" + person);
        }
        list();
    }

    public static void list() {
        List<Integer> li = new ArrayList();
        while (li.size() < 10) {
            Random ran = new Random();
            int person = ran.nextInt(10) + 1;
            if (!(li.contains(person))) {
                li.add(person);
            }
        }
        System.out.println(li);
    }

    public static int[] ran() {
        int[] a = new int[10];
        Random random = new Random();
        int j = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(10);
            while (j < i) {
                for (j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        a[i] = random.nextInt(10);
                        break;
                    }
                }
            }
        }
        return a;
    }

    //表演者名字
    public static String person(int i) {
        String person = null;
        if (i == 1) {
            person = "周杰伦";
        } else if (i == 2) {
            person = "林俊杰";
        } else if (i == 3) {
            person = "五月天";
        } else if (i == 4) {
            person = "邓紫棋";
        } else if (i == 5) {
            person = "霉霉";
        } else if (i == 6) {
            person = "Justin";
        } else if (i == 7) {
            person = "A神";
        } else if (i == 8) {
            person = "汪苏泷";
        } else if (i == 9) {
            person = "周笔畅";
        } else if (i == 10) {
            person = "毛不易";
        }
        return person;
    }

}
