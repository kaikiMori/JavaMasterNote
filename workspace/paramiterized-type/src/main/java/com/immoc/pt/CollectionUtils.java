package com.immoc.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ClassName: CollectionUtils
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 13:32
 * @Version 1.0
 */
//实现随机选择List中的元素
public class CollectionUtils<E> {
    private List<E> data = new ArrayList();
    public void add(E element){
        data.add(element);
    }
    public E randomSelect(){
        int idx = new Random().nextInt(data.size());
        E ret = data.get(idx);
        return ret;
    }

    public static void main(String[] args) {
        CollectionUtils<String> utils = new CollectionUtils<>();
        utils.add("zhang");
        utils.add("li");
        utils.add("wang");
        utils.add("zhao");
        String s = utils.randomSelect();
        System.out.println(s);
    }
}
