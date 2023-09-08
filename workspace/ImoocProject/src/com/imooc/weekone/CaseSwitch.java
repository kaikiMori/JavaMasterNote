package com.imooc;

import java.util.Scanner;

public class CaseSwitch {

	public static void main(String[] args) {
		// 根据键盘数字输出星期几
		Scanner s = new Scanner(System.in);
		System.out.print("请输入1-7的数字：");
		int num = s.nextInt();
		//如果case是单词，可以有week = week.toUpperCase();就不用担心大小写问题
		switch(num) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("请输入正确数字");
		}

	}

}
