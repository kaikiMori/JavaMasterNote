package com.imooc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: ListSorter
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 11:50
 * @Version 1.0
 */
public class ListSorter {
    class SampleComparator implements Comparator<Integer>{
        //70,80,90,40
        //结果>0，则交换位置
        //等于或小于0，位置不变
        @Override
        public int compare(Integer o1, Integer o2) {
            //o1-o2 acs
            return o2-o1;
        }
    }
    public List<Integer> sort(List<Integer> list){
        //默认升序
        Collections.sort(list, new SampleComparator());
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(40);
        System.out.println(list);
        ListSorter listSorter = new ListSorter();
        List<Integer> list1 = listSorter.sort(list);
        System.out.println(list1);
    }
}
