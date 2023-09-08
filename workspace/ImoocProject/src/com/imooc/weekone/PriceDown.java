package com.imooc.weekone;

import java.util.Scanner;

public class PriceDown {

	public static void main(String[] args) {
		// 满100-20
		Scanner s= new Scanner(System.in);
		System.out.println("请输入商品价格：");
		int coat = s.nextInt();
		System.out.println("请输入商品价格：");
		int pants = s.nextInt();
		int priceAll;
		priceAll = coat + pants;
		if(priceAll > 100) {
			System.out.println("原价是："+priceAll);
			priceAll -= 20;
			System.out.println("折扣后价格是："+priceAll);
		}else {
			System.out.println("总价是："+priceAll);
		}

	}

}
