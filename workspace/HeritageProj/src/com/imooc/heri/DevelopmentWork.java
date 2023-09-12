package com.imooc.heri;

public class DevelopmentWork extends Work {
    // 属性：有效编码行数、目前没有解决的Bug个数
	private int vtestNum;
    private int nbugNum;
	//编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public DevelopmentWork(){
	    
	}
//	public DevelopmentWork(int vtestNum,int nbugNum){
//	    super();
//	    this.setVtestNum(vtestNum);
//	    this.setNbugNum(nbugNum);
//	}
    // 公有的get***/set***方法完成属性封装
	public int getVtestNum() {
		return vtestNum;
	}
	public void setVtestNum(int vtestNum) {
		this.vtestNum = vtestNum;
	}
     public int getNbugNum() {
		return nbugNum;
	}
	public void setNbugNum(int nbugNum) {
		this.nbugNum = nbugNum;
	}
	// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
	public String work() {
        String str = this.getName() + "的日报是：今天编写了"+this.getVtestNum()+"行代码，目前仍然有"+this.getNbugNum()+"个bug没有解决";
        return str;
	}
}