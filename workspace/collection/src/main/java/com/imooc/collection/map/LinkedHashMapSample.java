package com.imooc.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ClassName: LinkedHashMapSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 11:24
 * @Version 1.0
 */
public class LinkedHashMapSample {
    public static void main(String[] args) {
        //LinkedHashMap<String, Object> student = new LinkedHashMap<>();
        Map<String, Object> student = new LinkedHashMap<>();
        student.put("name", "judy");
        student.put("height", 181);
        student.put("age", 18);
        student.put("weight", 88);
        //放入顺序和提取顺序一致
        System.out.println(student);
    }
}
