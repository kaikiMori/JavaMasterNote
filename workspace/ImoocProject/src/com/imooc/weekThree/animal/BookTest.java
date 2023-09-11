package com.imooc.weekThree.animal;

public class BookTest {

    // 测试方法
	 public static void main(String[] args) {
     //实例化对象，调用相关方法实现运行效果
       Book b = new Book("红楼梦","曹雪芹","人民文学出版社",8);
       b.description();
       
       System.out.println("======================");
       Book b1 = new Book("小李飞刀","古龙","中国长安出版社",55.5);
       b1.description();
       
    }
}