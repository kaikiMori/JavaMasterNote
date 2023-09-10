package com.imooc.weekTwo;

public class AreaDemo {
	//求圆形面积
		public double area(double n){
		    double area = n * n * Math.PI;
		    return area;
		}
	    
		//求长方形面积
	    public double area(double n,double m){
	        double area = n * m;
	        return area;
	    }

		public static void main(String[] args) {
			//定义对象
			AreaDemo ad = new AreaDemo();
			//定义一个double类型的变量存放半径，并初始化
			double round = 4.5;
			//定义两个变量存放长和宽，并初始化
			double l = 8;
			double w = 5;
			//调用方法，求圆的面积并打印输出
			double ra = ad.area(round);
			System.out.println("圆的面积为：" + ra);
			//调用方法，求长方形面积并打印输出
			double ca = ad.area(l,w);
			System.out.println("长方形的面积为：" + ca);
		}

}
