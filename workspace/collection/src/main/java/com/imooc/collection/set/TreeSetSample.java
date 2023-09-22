package com.imooc.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName: TreeSetSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 10:48
 * @Version 1.0
 */
public class TreeSetSample {
    //自定义排序规则
    class IntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            //升序排列
            return o1-o2;
            //降序排列：o2-o1
        }
    }

    public void sort(){
        Set<Integer> set = new TreeSet<Integer>(new IntegerComparator());
        set.add(100);
        set.add(120);
        set.add(140);
        set.add(180);
        System.out.println(set);
    }

    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<Integer>(new IntegerComparator());
//        set.add(100);
//        set.add(120);
//        set.add(140);
//        set.add(180);
//        System.out.println(set);
        new TreeSetSample().sort();
    }
}
