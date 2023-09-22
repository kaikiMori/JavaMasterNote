package com.imooc.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListLoopSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/21 16:46
 * @Version 1.0
 */
public class ListLoopSample {
    public static void main(String[] args) {
        List<String> booklist = new ArrayList<String>();
        booklist.add("三国演义");
        booklist.add("在路上");
        booklist.add("西游记");
        booklist.add("红楼梦");
        System.out.println(booklist);

        for(String book:booklist){
            System.out.println(book);
        }
        System.out.println("=====================");
        booklist.forEach(book->{
            System.out.println(book);
        });
        System.out.println("=====================");
        //迭代器
        Iterator<String> itr = booklist.iterator();
        while(itr.hasNext()){
            String book = itr.next();
            System.out.println(book);
        }
    }
}
