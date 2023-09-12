package com.imooc.heri;

public class Test {
    public static void main(String[] args) {
        Work w = new Work();
		System.out.print("父类信息测试：");
	    System.out.println(w.work());
	    TestWork tw = new TestWork();
	    tw.setName("测试工作");
	    tw.setTestNum(10);
	    tw.setBugNum(5);
		System.out.print("测试工作类信息测试：");
	    System.out.println(tw.work());
	    DevelopmentWork dw = new DevelopmentWork();
	    dw.setName("研发工作");
	    dw.setVtestNum(1000);
	    dw.setNbugNum(10);
		System.out.print("研发工作类信息测试：");
	    System.out.println(dw.work());
	}
}
