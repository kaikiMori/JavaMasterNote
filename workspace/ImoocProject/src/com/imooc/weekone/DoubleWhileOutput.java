package com.imooc.weekone;

public class DoubleWhileOutput {

	public static void main(String[] args) {
		// 循环嵌套while输入10行10列*
		int n = 1;
		int j = 1;
		while(n <= 10) {
			j = 1;
			while(j <= 10) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			n++;
		}
	}

}
