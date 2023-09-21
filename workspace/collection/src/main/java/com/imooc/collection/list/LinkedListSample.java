package com.imooc.collection.list;

import java.util.LinkedList;

/**
 * ClassName: LinkedListSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/21 16:26
 * @Version 1.0
 */
public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> booklist = new LinkedList<String>();
        booklist.add("三国演义");
        booklist.add("在路上");
        booklist.add("西游记");
        booklist.add("红楼梦");
        System.out.println(booklist);
        booklist.addFirst("狂叫");
        booklist.addLast("狂人日记");
        System.out.println(booklist);
    }
}
