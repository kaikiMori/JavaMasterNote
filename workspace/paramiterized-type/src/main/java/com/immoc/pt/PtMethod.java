package com.immoc.pt;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: PtMethod
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 13:41
 * @Version 1.0
 */
public class PtMethod {
    //将数组添加到list列表中
    public <T> List<T> transferToList(T[] array){
        List<T> list = new ArrayList<>();
        for(T item:array){
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args) {
        PtMethod ptMethod = new PtMethod();
        String[] array = new String[]{"a","B","c","d","e"};
        List<String> list = ptMethod.transferToList(array);
        System.out.println(list.get(2));
    }
}
