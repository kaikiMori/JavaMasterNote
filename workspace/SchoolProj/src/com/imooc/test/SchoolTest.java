package com.imooc.test;
import com.imooc.model.Student;
import com.imooc.model.Subject;
public class SchoolTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//测试Subject类
		Subject sub1 = new Subject("计算机科学与应用","J0001",4);
		System.out.println(sub1.info());
		System.out.println("============================");
		
		//测试Student类
		Student stu1 = new Student("S01","张三","男",18,sub1);
		System.out.println(stu1);
	}

}
