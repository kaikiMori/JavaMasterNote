package com.imooc.collection.map;

import java.util.HashMap;

/**
 * ClassName: HashMapSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 11:15
 * @Version 1.0
 */
public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, Object> student = new HashMap<>();
        student.put("name", "judy");
        String name = (String) student.put("name", "jack");
        System.out.println(name + " has already changed to Jack" );
        student.put("height", 181);
        student.put("age", 18);
        student.put("weight", 88);
        System.out.println(student);
        String n = (String) student.get("name");
        System.out.println(n);
//containsKey usually use
        boolean b1 = student.containsKey("name");
        boolean b2 = student.containsValue("jack");
        System.out.println(b1);
        System.out.println(b2);

        Integer w = (Integer) student.remove("weight");
        System.out.println(w);
        System.out.println(student);
    }
}
