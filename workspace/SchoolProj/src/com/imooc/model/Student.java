package com.imooc.model;

public class Student {
	//学号，姓名，性别，年龄
	//另加上专业
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
	public Student() {
		
	}
	public Student(String studnetNo,String studentName,String studentSex,int studentAge,Subject studentSubject) {
		this.setStudentNo(studnetNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
	}
	
	/**
	 * 获取专业对象，如果没有实例化，先实例化之后再返回
	 * @return 专业对象信息
	 */
	public Subject getStudentSubject() {
		if(this.studentSubject == null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}
	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSex() {
		return studentSex;
	}
	
	//性别只能是男或者女，否则强制赋值为男
	public void setStudentSex(String studentSex) {
		if(studentSex.equals("男") || studentSex.equals("女")) {
			this.studentSex = studentSex;
		}else {
			this.setStudentSex("男");
		}
		
	}
	public int getStudentAge() {
		return studentAge;
	}
	
	//年龄限制，10-100,否则强制赋值为18
	public void setStudentAge(int studentAge) {
		if(studentAge < 10 || studentAge > 100) {
			this.studentAge = 18;
		}else {
			this.studentAge = studentAge;
		}
		
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentSex=" + studentSex
				+ ", studentAge=" + studentAge + ", studentSubject=" + studentSubject + "]";
	}
	
	

}
