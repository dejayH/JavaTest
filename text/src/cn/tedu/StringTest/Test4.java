package cn.tedu.StringTest;

public class Test4 {
    public static void main(String[] args) {
//        4.编写程序将 “jdk” 全部变为大写,并输出到屏幕,截取子串”DK” 并输出到屏幕
        String s = "jdk";
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(s.substring(1));
    }
}
