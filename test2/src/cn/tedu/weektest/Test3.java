package cn.tedu.weektest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出。（list集合遍历方法总结）
        List<Integer> li = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            li.add(i);
        }
        //1
        Iterator it = li.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println("一");

        //2,
        Iterator lit = li.listIterator();
        while (lit.hasNext()){
            System.out.print(lit.next());
        }
        System.out.println("二");

        //3,
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i));
        }
        System.out.println("三");

        //4,
        for(Integer d : li){
            System.out.print(d);
        }
    }
}
