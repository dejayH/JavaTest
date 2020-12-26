package cn.tedu.Exam;
//2，以下是斐波那契数列的前7位，1，1，2，3，5，8，13...自己总结规则，用代码求出第15位是多少。
public class Q02 {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 1; j <= 15; j++) {
           if(j == 15){
               System.out.println("第"+j+"个数是"+f(j));
           }

        }

    }

    public static int f(int x) {
        if(x == 1 || x ==2){
            return 1;
        }else{
            return f(x - 1) +f(x - 2);
        }


    }
}
