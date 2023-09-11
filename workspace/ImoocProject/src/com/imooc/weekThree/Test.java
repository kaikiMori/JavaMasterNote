package com.imooc.weekThree;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//实例化对象，调用相关方法实现运行效果
		Scanner s = new Scanner(System.in);
		User one = new User();
		User two = new User();
		UserManager um = new UserManager();
		System.out.print("请输入用户名：");
		String name1 = s.next();
		one.setName(name1);
		System.out.print("请输入密码：");
		String pwd1 = s.next();
		one.setPassword(pwd1);
		
		System.out.print("请输入用户名：");
		String name2 = s.next();
		two.setName(name2);
		System.out.print("请输入密码：");
		String pwd2 = s.next();
		two.setPassword(pwd2);
		
		System.out.println("===============");
		System.out.print(um.checkUser(one, two));
		s.close();
	}

}
