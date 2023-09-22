package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

/**
 * ClassName: ClassSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 16:18
 * @Version 1.0
 */
public class ClassSample {
    public static void main(String[] args) {
        try {
            //Class.forname() 方法将指定的类加载到jvm，并返回对应class对象
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            System.out.println("employee已被加载到jvm");
            //newInstance通过默认构造方法创建新的对象
            Employee emp = (Employee)employeeClass.newInstance();
            System.out.println(emp);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
