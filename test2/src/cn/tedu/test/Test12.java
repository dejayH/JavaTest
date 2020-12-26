package cn.tedu.test;

public class Test12 {
    public static void main(String[] args) {
//        6.1求1~1000以内质数列表
//        PS：质数是只能被1和自身整除的整数
        int i,j;
        for (i = 1; i < 1000; i++) {
            for (j = 2; j < i; j++) {
                if(i%j ==0){
                    break;
                }
            }
            if(i == j){
                System.out.println(j);
            }
        }
    }
}
