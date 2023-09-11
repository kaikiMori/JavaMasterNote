package com.imooc.weekThree;

public class UserManager {
	// 用户信息验证的方法
    public String checkUser(User one, User two) {
       // 判断用户名和密码是否为空，是否一致
    	if(one.getName() != null && one.getPassword() != null && two.getName() != null && two.getPassword() != null ) {
    		if(one.getName().equals(two.getName()) && one.getPassword().equals(two.getPassword())){
    			return "用户名和密码一致";
    		}else {
    			return "用户名和密码不一致";
    		}
    	}else {
    		return "用户名或密码为空";
    	}
    	
    }
}
