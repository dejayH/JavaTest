package cn.tedu.reflect;

import java.lang.reflect.Method;

//测试 利用反射执行有注解的方法
public class TestPerson {
    public static void main(String[] args) throws Exception {
        method();
    }

    private static void method() throws Exception {
        Class p = Person.class;
        Method[] me = p.getDeclaredMethods();
        Object o = p.newInstance();

        for(Method i : me){
            if(i.getAnnotation(Controller.class) != null){
                i.setAccessible(true);
                i.invoke(o);
            }
        }
    }
}
