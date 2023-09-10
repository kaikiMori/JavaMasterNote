package com.imooc.weekTwo;

public class DiscountDemo {
	 //根据商品总价输出折后总价
    public void countAll(float a){
        if(a < 100){
            System.out.println("不打折");
        }else if(a >= 100 && a <=199){
            System.out.println("折后商品总价为：" + 0.95*a);
        }else if(a >= 200)
            System.out.println("折后商品总价为：" + 0.85*a);
    }
	public static void main(String[] args) {
		//定义对象
		DiscountDemo ds = new DiscountDemo();
		//定义商品总价存放到变量中
		int m = 150;

		//调用方法，输出折后商品总价
		ds.countAll(m);
	}

}
