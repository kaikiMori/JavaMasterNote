package com.imooc.heri;

public class ElectricVehicle extends NonMotor {
    // 私有属性：电池品牌
	private String elecBrand;
	
	public ElectricVehicle() {
		
	}
    // 公有的get***/set***方法完成属性封装

	public String getElecBrand() {
		return elecBrand;
	}

	public void setElecBrand(String elecBrand) {
		this.elecBrand = elecBrand;
	}
	
	// 重写运行方法，描述内容为：这是一辆使用**牌电池的电动车。其中**的数据由属性提供
	public String work() {
		String str = "这是一辆使用"+ this.getElecBrand()+"牌电池的电动车";
		return str;
	}
}
