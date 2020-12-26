package cn.tedu.Exam;
//4，写代码实现输出1-100之间的所有偶数，格式如下：第n个偶数是m。
public class Q04 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <=100 ; i++) {
            if(i % 2 == 0){
                System.out.println("第"+num+++"个偶数是"+i);
            }

        }

    }
}
