package cn.tedu.Exam;
//13.输出1－1000之间的质数，输出时10个一行。
//（什么是质数：即只能被1和它本身整除的数，也可以说是除了1和它本身不能被其它任何数除的数）
public class Q13 {
    public static void main(String[] args) {
        int i,j;
        int num = 1;
        for (i = 1; i <=1000 ; i++) {
            for (j = 2; j < i; j++) {
                if(i % j == 0){
                    break;
                }
            }
            if(i == j){
                if(num++ % 10 ==0){//到第10个时换行
                    System.out.print(i);
                    System.out.println();
                }else {
                     System.out.print(i+",");
                }
            }

        }

    }

}
