package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: ConstructorSample
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/25 10:12
 * @Version 1.0
 */
public class ConstructorSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100,"李雷",3000,"研发部"
            });
            System.out.println(employee);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            //目标调用异常，当被调用的方法的内部抛出了异常而没有被捕获时
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
