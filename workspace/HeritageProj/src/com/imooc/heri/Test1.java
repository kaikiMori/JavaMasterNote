package com.imooc.heri;

public class Test1 {
    public static void main(String[] args) {
    	NonMotor n = new NonMotor();
    	n.setBrandName("天宇牌");
    	n.setColor("红颜色");
    	n.setWheel(4);
    	n.setChair(2);
		System.out.print("父类信息测试：");
		System.out.println(n.work());
		
		Bicycle b = new Bicycle();
		b.setBrandName("捷安特牌");
		b.setColor("黄颜色");
		System.out.print("自行车类信息测试：");
		System.out.println(b.work());
		
		ElectricVehicle e = new ElectricVehicle();
		e.setElecBrand("飞鸽牌");
		System.out.print("电动车类信息测试：");
		System.out.println(e.work());
		
		Tricycle t = new Tricycle();
		System.out.print("三轮车类信息测试：");
		System.out.println(t.work());
	}
}
