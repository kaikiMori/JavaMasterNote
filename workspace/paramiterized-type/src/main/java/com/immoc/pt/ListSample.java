package com.immoc.pt;

import java.util.ArrayList;

/**
 * ClassName: ListSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 13:21
 * @Version 1.0
 */
public class ListSample {
    public void sample1(){
        ArrayList booklist = new ArrayList();
        booklist.add("on the way");
        booklist.add("two books");
        booklist.add(3.1415);
        Object o1 = booklist.get(0);
        String bookname1 = (String)o1;
        System.out.println(bookname1.substring(0,1));
        //此处这里会报错
//        Object o2 = booklist.get(2);
//        String bookname2 = (String)o2;
//        System.out.println(bookname2.substring(0,1));
    }
    public void sample2() {
        ArrayList<String> booklist = new ArrayList<>();
        booklist.add("on the way");
        booklist.add("two books");
        //booklist.add(3.1415);
        //Object o1 = booklist.get(0);
        //String bookname1 = (String)o1;
        String bookname1 = booklist.get(0);
        System.out.println(bookname1.substring(0, 1));
    }
    public static void main(String[] args) {
        ListSample listSample = new ListSample();
        listSample.sample1();
        listSample.sample2();
    }
}
