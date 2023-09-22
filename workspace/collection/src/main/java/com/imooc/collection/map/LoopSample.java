package com.imooc.collection.map;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: LoopSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 11:37
 * @Version 1.0
 */
public class LoopSample {
    public void doForLoop(Map map){
        Set<String> keys = map.keySet();
        for(String k:keys){
            System.out.println(k + ":"+ map.get(k));
        }
    }

    public void doForEach(Map map){
        map.forEach((key,value) ->{
            System.out.println(key + ":" + value);
        });
    }

    public void doIterator(Map map){
        Iterator<Map.Entry<String,Object>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Object> entry = itr.next();
            System.out.println(entry.getKey() +":" +entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Object> student = new HashMap<>();
        student.put("name", "judy");
        student.put("height", 181);
        student.put("age", 18);
        student.put("weight", 88);
        System.out.println(student);
        LoopSample loopSample = new LoopSample();
        loopSample.doForLoop(student);
        System.out.println("==============");
        loopSample.doForEach(student);
        System.out.println("==============");
        loopSample.doIterator(student);
    }
}
