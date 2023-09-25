package com.imooc.reflect.entity;

/**
 * ClassName: Employee
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 16:16
 * @Version 1.0
 */
public class Employee {
    static {
        System.out.println("employee类已被加载到jvm，并已被初始化");
    }
    private Integer eno;
    private String ename;
    private Float salary;
    private String dname;

    public Employee() {
        System.out.println("默认构造方法执行");
    }

    public Employee(Integer eno, String ename, Float salary, String dname) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.dname = dname;
        System.out.println("带参构造方法执行");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", dname='" + dname + '\'' +
                '}';
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
