package cn.tedu.StringTest;

public class Text3 {
    public static void main(String[] args) {
//        3.给定一个字符串"我送你离开,千里之外,你无声黑白"按","号拆分 返回数组
        String s = "我送你离开,千里之外,你无声黑白";
        String[] st = s.split(",");
        for(String i : st){
            System.out.println(i);
        }

    }
}
