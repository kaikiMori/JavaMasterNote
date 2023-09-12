package com.imooc.model;

public class Subject {
	//学科名称，学科编号，学制年限
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	
	public Subject() {
		
	}
	
	public Subject(String subjectName,String subjectNo,int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public int getSubjectLife() {
		return subjectLife;
	}
	
	//设置学制年限，必须大于0
	public void setSubjectLife(int subjectLife) {
		if(subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	public String info() {
		String str = "专业名称: " + this.getSubjectName() + ",编号: " + this.getSubjectNo() +",年限: " + this.getSubjectLife();
		
		return str;
	}
	
	
	
}
