package cn.tedu.Exam;
//3，求1，2，2，3，3，3，4，4，4，4的第100项。
public class Q03 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j <=i; j++) {
                num++;
                if (num == 100){
                    System.out.println(num+"项为"+i);
                }

            }
        }

    }
}
