package com.imooc;

public class CaseOutputAlpha {

	public static void main(String[] args) {
		// 循环输出a-z，分两行
		char ch = 'a';
		int n = 1;
		while(ch <= 'z') {
			System.out.print(ch +" ");
			if(n == 13) {
				System.out.println();
			}
			ch++;
			n++;	
		}

	}

}
