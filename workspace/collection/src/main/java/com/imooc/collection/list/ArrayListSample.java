package com.imooc.collection.list;

import java.util.ArrayList;

/**
 * ClassName: ArrayListSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/21 15:32
 * @Version 1.0
 */
public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> booklist = new ArrayList<String>();
        booklist.add("三国演义");
        booklist.add("在路上");
        System.out.println(booklist);
        String bookname = booklist.get(0);
        System.out.println(bookname);
        booklist.add(1,"红楼梦");
        System.out.println(booklist);
        boolean result = booklist.add("西游记");
        System.out.println(result);
        String name = booklist.set(3,"西游记不由己");
        System.out.println(name);
        System.out.println(booklist);
        Boolean delResult = booklist.remove("西游记不由己");
        System.out.println(delResult);
        System.out.println(booklist);

        String delBefore = booklist.remove(0);
        System.out.println(delBefore);
        System.out.println(booklist);

        int count = booklist.size();
        System.out.println(count);
//        更新最后一个元素
        booklist.set(booklist.size() - 1, "新书");
        System.out.println(booklist);
    }
}
