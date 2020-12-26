package cn.tedu.reflect;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test3Student {
    public static void main(String[] args) throws Exception {
        Class c = Student.class;
        method(c);
//        method2(c);
//        method3(c);
//        method4(c);
//        method5(c);
//        method6(c);
    }

    //利用反射运行方法
    private static void method6(Class c) throws Exception {
        //获取一个方法
        Method cs = c.getDeclaredMethod("show",int.class);
        Object o =c.newInstance();
        //被私有化的方法要进行写/改的操作,必须开启权限
        cs.setAccessible(true);
        Object i = cs.invoke(o,2000);
    }

    //利用反射给成员变量set/get
    private static void method5(Class c) throws Exception {
        Field f = c.getDeclaredField("age");
        //set(1,2) -- 1是对象,2是给属性赋的具体值
        Object o = c.newInstance();
        //私有化使用前必须开启权限
        f.setAccessible(true);
        f.set(o, 300);
        Object o1 = f.get(o);
        System.out.println(o1);
    }

    //利用反射创建对象
    private static void method4(Class c) throws Exception {
        //利用反射创建对象 -- 触发 无参构造 创建对象
        Object o = c.newInstance();
        System.out.println(o);
        //反射 一个 指定构造方法
        Constructor cs = c.getConstructor(String.class, int.class);
        Object ob = cs.newInstance("jack", 123);
        System.out.println(ob);
    }

    //反射构造方法们
    private static void method3(Class c) {
        //getConstructors()
        Constructor[] con = c.getConstructors();
        for (Constructor i : con) {
            System.out.println(i.getName());
            Class[] pa = i.getParameterTypes();
            System.out.println(Arrays.toString(pa));
        }
    }

    //反射成员变量
    private static void method2(Class c) {
        Field[] f = c.getFields();
        for (Field i : f) {
            System.out.println(i.getName());
            //参数类型
            System.out.println(i.getType().getName());
        }
    }

    //放射方法们
    private static void method(Class c) {
        Method[] ms = c.getDeclaredMethods();
        for (Method i : ms) {
            //获取方法名
            System.out.println(i.getName());
            //获取方法的参数类型
            Class[] cs = i.getParameterTypes();
            System.out.println(Arrays.toString(cs));

        }
    }

}

