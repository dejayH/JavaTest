package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Annotation注解
public class Test1 {
    public static void main(String[] args) {

    }
}
//第一步:自定义一个注解--jdk/框架提供的
//语法:@interface 注解名

//元注解,用来描述注解的生命周期
@Retention(RetentionPolicy.SOURCE)
//元注解,用来描述注解的出现的位置--出现在类上
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface Test {
    String name() default "ja";
    int age() default 0;
    String value();//特殊属性--特殊在用时直接赋值
}

//第二部:使用注解--必会
//语法:@注解名
@Test( "intex")
class Demo {
    @Test( "y")
    int y;

    @Test("yt")
    public static void test() {

    }

}

