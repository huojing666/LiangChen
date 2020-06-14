package Sweeney;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    //测试List一边遍历一边删除
    public static void main(String[] args) {
        //并发修改异常
        //java.util.ConcurrentModificationException
        List<String> list = new ArrayList<String>();
        list.add("何静");
        list.add("王八蛋");
        list.add("沙雕");
        list.add("money");
        list.add("豆芽");
//        for (String he:list ) {
//            if (he.equals("何静")){
//                list.remove(he);
//            }
//        }
//        System.out.println(list);
        //使用Iterator的remove()方法
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String he = iterator.next();
            if (he.equals("何静")){
                iterator.remove();
            }
        }
        System.out.println(list);

        //使用for循环正序遍历
        for (int i = 0; i <list.size() ; i++) {
            String he = list.get(i);
            if (he.equals("money")){
                list.remove(he);
                i=i-1;
            }
        }
        System.out.println(list);
    }
}
