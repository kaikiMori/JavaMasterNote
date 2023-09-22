package com.imooc.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * ClassName: TreeMapSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 11:28
 * @Version 1.0
 */
public class TreeMapSample {
    class RecordComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            //o1在前，升序，o2在前，降序
            return o2.compareTo(o1);
        }
    }
    public void sort(){
        Map<String,Object> record = new TreeMap<>(new RecordComparator());
        record.put("a1","1");
        record.put("c3","2");
        record.put("b5","3");
        record.put("x1","4");
        record.put("b1","5");
        //对key进行排序后再存储
        System.out.println(record);
    }
    public static void main(String[] args) {
//        Map<String,Object> record = new TreeMap<>();
//        record.put("a1","1");
//        record.put("c3","2");
//        record.put("b5","3");
//        record.put("x1","4");
//        record.put("b1","5");
//        //对key进行排序后再存储
//        System.out.println(record);
        TreeMapSample sample = new TreeMapSample();
        sample.sort();
    }
}
