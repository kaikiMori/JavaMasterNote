package com.imooc.weekTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreManage {
	/**
	 * 显示菜单
	 */
	public void displayMenu() { 
		System.out.println("************************************");
		System.out.println("         1:初始化数学成绩");
		System.out.println("         2:求成绩的平均值");
		System.out.println("         3:统计成绩大于85分的人数");
		System.out.println("         4:修改指定位置处的成绩");
		System.out.println("         5:打印输出所有成绩");
		System.out.println("         0:退出");
		System.out.println("************************************");
	}
	
	/**
	 * 初始化数学成绩
	 * @return
	 */
	public float[] initScore() { 
		Scanner sc = new Scanner(System.in);
		//接收数组的长度
		int arrLength=0;
		System.out.print("请指定数组的长度：");
		arrLength = sc.nextInt();
		float[] a = new float[arrLength];
		//接收数据
		for(int i = 0; i < a.length; i++) {
			System.out.print("请输入第" + (i+1) + "个数据：");
			try {
				a[i] = sc.nextFloat();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字。");
				sc.next();
				i--;
			}
		}
		return a;
	}
	
	/**
	 * 求平均成绩
	 * @param f：数组
	 * @return：求出来的平均成绩
	 */
	public float average(float[] f) { 
		float avg = 0;
		float sum = 0;
		for(float n:f) {
			//将所有数学成绩求和
			sum += n;
		}
		//平均成绩
		avg = sum / f.length;
		return avg;
	} 
	
	/**
	 * 统计成绩大于85分的人数
	 * @param f
	 * @return:大于85的人数
	 */
	public int count(float[] f) { 
		int count = 0;
		for(float n :f) {
			if(n >= 85) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 修改指定位置处成绩
	 * @param f:数组
	 * @param index：指定位置
	 * @param newScore：更新后的成绩
	 */
	public void update(float[] f, int index, float newScore) { 
		f[index] = newScore;
	}  
	
	/**
	 * 打印输出所有成绩
	 * @param f
	 */
	public void displayAllScore(float[] f) { 
		for(float n:f) {
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ScoreManage sm = new ScoreManage();
		float[] a = null;
		int input = 0;
		int index = 0;
		float newScore = 0;
		while(true) {
			sm.displayMenu();
			System.out.print("请输入对应的数字进行操作：");
			try {
				input = s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字。");
				s.next();
				continue;
			}
			if(input == 0) {
				System.out.println("退出程序!");
				break;
			}
			switch(input) {
			case 1:
				//插入数据
				a = sm.initScore(); 
				break;
			case 2:
				if(a != null) {
					float avg = sm.average(a);
					System.out.println("数学平均成绩为：" + avg);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				break;
			case 3:
				if(a != null) {
					int count = sm.count(a);
					System.out.println("成绩大于85分的人数为：" + count);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				break;
			case 4:
				if(a != null) {
					System.out.println("修改前成绩为：");
					sm.displayAllScore(a);
					System.out.println();
					try {
						System.out.print("请输入要修改数据的位置（从0开始）：");
						index = s.nextInt();
						if(index > a.length - 1) {
							System.out.println("超出数组最大范围！请重试");
							break;
						}
						System.out.print("请输入新数据：");
						newScore = s.nextFloat();
					}catch(InputMismatchException e) {
						System.out.println("输入的数据格式有误，不能有非数字。");
						s.next();
						break;
					}
					sm.update(a, index, newScore);
					System.out.println("修改后成绩为：");
					sm.displayAllScore(a);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				break;
			case 5:
				if(a != null) {
					System.out.println("成绩为：");
					sm.displayAllScore(a);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				break;
			default:
				System.out.println("请输入正确范围内的数字（0-5）");
		}

	}

}
}
