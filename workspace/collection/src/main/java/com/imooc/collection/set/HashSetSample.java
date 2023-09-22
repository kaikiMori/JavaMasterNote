package com.imooc.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: HashSetSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 10:06
 * @Version 1.0
 */
public class HashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new HashSet<String>();
        mobileSet.add("12345676543");
        mobileSet.add("12345676542");
        mobileSet.add("12345676541");
        boolean result = mobileSet.contains("12345676541");
        boolean isChange = mobileSet.add("12345676541");
        System.out.println(mobileSet);
        System.out.println(isChange);
        System.out.println(result);
    }
}
