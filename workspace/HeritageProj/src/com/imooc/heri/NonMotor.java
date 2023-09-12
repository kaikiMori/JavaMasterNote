package com.imooc.heri;

public class NonMotor {
    // 私有属性：品牌、颜色、轮子(默认2个)、座椅（默认 1个）
	private String brandName;
	private String color;
	private int wheel = 2;
	private int chair = 1;
	
	// 无参构造方法
	public NonMotor() {
		
	}
	// 双参构造方法，完成对品牌和颜色的赋值
	public NonMotor(String brandName,String color) {
		this.setBrandName(brandName);
		this.setColor(color);
	}
	// 四参构造方法，分别对所有属性赋值
	public NonMotor(String brandName,String color,int wheel,int chair) {
		this.setBrandName(brandName);
		this.setColor(color);
		this.setWheel(wheel);
		this.setChair(chair);
	}
   // 公有的get***/set***方法完成属性封装
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getChair() {
		return chair;
	}
	public void setChair(int chair) {
		this.chair = chair;
	}

	// 方法：运行，描述内容为：这是一辆**颜色的，**牌的非机动车，有**个轮子，有**个座椅的非机动车。其中**的数据由属性提供
	public String work() {
		String str = "这是一辆"+ this.getColor()+"颜色的，"+this.getBrandName()+"牌的非机动车，有"
				+this.getWheel()+"个轮子，有"+this.getChair()+"个座椅的非机动车。";
		return str;
	}

}