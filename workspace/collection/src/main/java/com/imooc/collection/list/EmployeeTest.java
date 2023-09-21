package com.imooc.collection.list;

import java.util.ArrayList;

/**
 * ClassName: EmployeeTest
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/21 15:54
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("judy", 1, 5900);
        Employee e2 = new Employee("Amber", 2, 6900);
        Employee e3 = new Employee("Jack", 3, 7900);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        System.out.println("员工姓名     员工工资");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() +"      "+ employees.get(i).getSalary() );
        }
    }
}
