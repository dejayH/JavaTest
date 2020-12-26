package cn.tedu.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//测试反射
public class Person {
    private void show( ) {
        System.out.println("show--");
    }
    @Controller("test")
    private void test() {
        System.out.println("test--");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Controller{
    String value();
    int age() default 20;
}
