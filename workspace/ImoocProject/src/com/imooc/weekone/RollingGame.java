package com.imooc.weekone;

public class RollingGame {

	public static void main(String[] args) {
		// 随机抽奖
		int n;
		for(int i = 1; i <= 3; i ++) {
			n = (int)(Math.random() * 10 + 1);
			//System.out.println(n);
			switch(n) {
			case 1:
				System.out.println("恭喜您抽中一等奖");
				break;
			case 2:
				System.out.println("恭喜您抽中2等奖");
				break;
			case 3:
				System.out.println("恭喜您抽中3等奖");
				break;
			default:
				System.out.println("很遗憾。。。");
			}
		}
	}

}
