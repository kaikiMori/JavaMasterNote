package com.imooc.weekTwo;

public class SortCase {

	public static void main(String[] args) {
		// bubble
		int[] a = {34,53,12,32,56,17};
		System.out.println("冒泡前的数组为：");
		for(int n :a) {
			System.out.print(n + " ");
		}
		System.out.println();
		int temp;
		for(int i = 0; i < a.length - 1;i++) {
			for(int j = 0;j < a.length - i - 1; j++) {
				if(a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("排序后的结果是：");
		for(int n :a) {
			System.out.print(n + " ");
		}
	}

}
