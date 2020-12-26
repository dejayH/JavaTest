package cn.tedu.api;
//测试 字符串拼接的工具类
public class Text1Stringbulid {
    public static void main(String[] args) {
        methon2();
        methon();
    }

    //用Stringbuilder拼接
    public static void methon2() {
        String s = "abcdefghijklmn";
        StringBuilder a = new StringBuilder();
        long Start = System.currentTimeMillis();//计时开始
        for (int i = 0; i < 1000000; i++) {
            a.append(s);
        }
        long end = System.currentTimeMillis();//计时结束
        System.out.println(end - Start);
    }

    //用+拼接
    public static void methon() {
        String s = "abcdefghijklmn";
        String a = "";
        long Start = System.currentTimeMillis();//计时开始
        for (int i = 0; i < 10000; i++) {
            a += s;
        }
        long end = System.currentTimeMillis();//计时结束
        System.out.println(end - Start);
    }

}
