package cn.detu.jdk;

public class Test1_5 {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
        add(1,2,3,4,5);
        add(1,2,3,4,5,6);
        add(1,2,3,4,5,6,7);
    }

    private static void add(int... i) {
        int sum = 0;
        for(int j : i){
            sum += j;
        }
        System.out.print(sum);
        System.out.println();
    }

}
