package cn.tedu.text;

public class StringImport {
    public static void main(String[] args) {
        String s = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s.hashCode());
        System.out.println(s.indexOf(3));
        System.out.println(s.isEmpty());
        System.out.println(s.lastIndexOf(2));

    }
}
