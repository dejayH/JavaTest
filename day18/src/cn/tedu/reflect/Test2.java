package cn.tedu.reflect;

//测试反射
public class Test2 {
    public static void main(String[] args) throws Exception {
        method();
    }

    //获取Class对象-- 解析String.class
    private static void method() throws Exception {
        //1,Class.forName("类名)
        Class c = Class.forName("java.lang.String");

        //2,类名.class
        Class<String> c1 = String.class;

        //3,对象.getClass
        Class c2 = new String().getClass();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        //TODO 解析String.class里的所以方法

    }
}
