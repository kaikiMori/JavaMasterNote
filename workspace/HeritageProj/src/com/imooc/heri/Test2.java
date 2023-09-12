package com.imooc.heri;

//测试类
public class Test2 {
  public static void main(String[] args) {
	  //实例化对象，传入属性值（李明, 男,18）
	  Person p = new Person("李明",18,"男");
     //打印输出对象信息
	  System.out.println(p);
	  System.out.println(p.toString());
	}
}