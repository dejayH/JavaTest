package cn.tedu.StringTest;

public class Text6 {
    public static void main(String[] args) {
//        特殊字屏蔽例   : 我去年买了一块表   变成 :  我去年买了***
        String s = "我去年买了一块表";
        String[] str = new String[s.length()];
        for(int i = 0;i<str.length;i++){
            str[i] = String.valueOf(s.charAt(i));
        }
        for(String i : str){
            if(i.equals("一") || i.equals("块") || i.equals("表")){
                System.out.print("*");
            }else{
                System.out.print(i);
            }

        }

    }
}
