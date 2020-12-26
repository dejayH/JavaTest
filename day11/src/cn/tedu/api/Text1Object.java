package cn.tedu.api;

//测试 Object测试类
public class Text1Object {
    public static void main(String[] args) {
        //1,创建对象
        Object o = new Object();
        System.out.println(o);
        //2,调用参数
        String y = o.toString();//返回o对象在内存中的地址值
        System.out.println(y);

        int j = o.hashCode();//o对象在内存中的哈希码值
        System.out.println(j);

        boolean k = o.equals(132);
        System.out.println(k);
    }
}

