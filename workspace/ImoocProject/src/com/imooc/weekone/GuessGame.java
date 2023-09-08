package com.imooc.weekone;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// 猜数字，并给出大小
		Scanner s = new Scanner(System.in);
		int num;
		//int n = 7;
		int n = (int)(Math.random() * 10 + 1);
		do {
			System.out.print("请猜一个1-10之间的数：");
			num = s.nextInt();
			if(n > num) {
				System.out.println("猜小了");
			}else if(n < num) {
				System.out.println("猜大了");
			}else {
				System.out.println("猜对了！恭喜");
			}
		}while(n != num);

	}

}
