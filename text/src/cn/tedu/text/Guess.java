package cn.tedu.text;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        String input = new Scanner(System.in).next();
        if(input.equals("布") || input.equals("剪刀") || input.equals("石头")){
            input = input;
        }else{
            input = "输入的值有误";
        }
        System.out.println(input);
        int com = (int) (Math.random() * 3 + 1);
        String output = "";
        switch (com) {
            case 1:
                output = "布";
                break;
            case 2:
                output = "剪刀";
                break;
            case 3:
                output = "石头";
                break;
        }
        String str;
        int computer = 0, player = 0;
        if (input.equals(output)) {
            str = "打平了";
        } else if ((input.equals("布") && output.equals("剪刀")) || (input.equals("剪刀") && output.equals("石头")) || (input.equals("石头") && output.equals("布"))) {
            str = "电脑赢了.";
            computer++;
        } else {
            str = "玩家赢了.";
            player++;
        }
        System.out.println("电脑出的是" + output + "," + str);
        System.out.println("电脑得分为:" + computer + ",玩家得分为:" + player);
    }

}
