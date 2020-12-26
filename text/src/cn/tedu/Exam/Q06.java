package cn.tedu.Exam;

import java.util.Scanner;

//6：某微信群第1天每人可领1元红包，第二天可领2元红包，第三天可领3元红包...用输入进群天数，让程序输出可领红包的总额。
public class Q06 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入进群的天数");
        int day = new Scanner(System.in).nextInt();
        for (int i = 1; i <= day; i++) {
            sum += i;
        }
        System.out.println("进了群"+day+"天,可领红包的总额为"+sum);
    }
}
