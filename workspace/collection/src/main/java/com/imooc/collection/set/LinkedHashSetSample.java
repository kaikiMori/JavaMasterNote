package com.imooc.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ClassName: LinkedHashSetSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 10:46
 * @Version 1.0
 */
public class LinkedHashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new LinkedHashSet<String>();
        //根据插入时的顺序,有序提取
        mobileSet.add("12345676543");
        mobileSet.add("12345676542");
        mobileSet.add("12345676541");
        System.out.println(mobileSet);

    }
}
