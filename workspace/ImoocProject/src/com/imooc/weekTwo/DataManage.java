package com.imooc.weekTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataManage {
/**
 * 从键盘中接收到整型数据，存放到数组中，并对数组中对数据进行管理
 * @param args
 */
	/**
	 * 从键盘接收数据
	 * @return 接收数据的数组
	 */
	public int[] insertData() {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		//少接收一个数据，为指定位置处插入数据做准备
		for(int i = 0; i < a.length - 1; i++) {
			System.out.print("请输入第" + (i+1) + "个数据：");
			try {
				a[i] = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字。");
				sc.next();
				i--;
			}
			
		}
		return a;
	}
	
	/**
	 * 显示数组中元素的内容
	 * @param a ：数组
	 * @param length：要显示的数组元素的个数
	 */
	public void showData(int[] a, int length) {
		for(int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 从键盘接收一个数据，插入到指定位置处
	 * @param a：数组
	 * @param n：要插入的数据
	 * @param k：指定位置处
	 */
	public void insertAtArray(int[] a, int n, int k) {
		//注意从最后一个数据开始移动，避免数据覆盖
		for(int i = a.length - 1; i > k; i--) {
			a[i] = a[i-1];
		}
		a[k] = n;
	}
	
	/**
	 * 从键盘接收一个数据,删除该指定位置处数组数据
	 * @param a：数组
	 * @param n：指定位置处
	 */
	public void deleteAtArray(int[] a, int n) {
		//注意从前往后移动，避免数据覆盖
		for(int i = n; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
		a[a.length - 1] = 0;
	}
	
	/**
	 * 输出数组中能被3整除的元素
	 * @param a：数组
	 */
	public void divThree(int[] a) {
		String str = "";
		int count = 0;
		for(int n : a) {
			if(n % 3 == 0 && n != 0) {
				str = str + n + " ";
				count++;
			}
		}
		if(count == 0) {
			System.out.println("数组中没有能被3整除的元素");
		}else {
			System.out.println("数组中能被3整除的元素:" + str);
		}
	}
	
	/**
	 * 提示信息
	 */
	public void notice() {
		System.out.println("************************************");
		System.out.println("         1:插入数据");
		System.out.println("         2:显示所有数据");
		System.out.println("         3:在指定位置处插入数据");
		System.out.println("         4:查询能被3整除的数据");
		System.out.println("         0:退出");
		System.out.println("************************************");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DataManage dm = new DataManage();
		int input = 0;
		int[] a = null;
		//要插入的数据
		int n = 0;
		//要插入的位置
		int k = 0;
		while(true) {
			dm.notice();
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
				a = dm.insertData(); 
				//显示数据
				System.out.println("数组元素为：");
				dm.showData(a, a.length-1);
				break;
			case 2:
				if(a != null) {
					System.out.println("数组元素为：");
					if(a[a.length - 1] == 0) {
						//如果数组最后一个元素为0，表示没有插入数据
						dm.showData(a, a.length-1);
					}else {
						dm.showData(a, a.length);
					}
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				break;
			case 3:
				if(a != null) {
					try {
						System.out.print("请输入要插入的数据：");
						n = s.nextInt();
						System.out.print("请输入要插入的位置：");
						k = s.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("输入的数据格式有误，不能有非数字。");
						s.next();
						break;
					}
					dm.insertAtArray(a, n, k);
					dm.showData(a, a.length);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				break;
			case 4:
				//查询数组中能被3整除的元素
				if(a != null) {
					dm.divThree(a);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				break;
			}
		}
		
//		System.out.print("请输入要删除的数组的位置：");
//		int deleteK = s.nextInt();
//		dm.deleteAtArray(a, deleteK);
//		dm.showData(a, a.length - 1);
//		dm.showData(a, a.length);
//		dm.divThree(a);
		
	}

}
