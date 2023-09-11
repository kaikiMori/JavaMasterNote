package com.imooc.weekThree;

public class User{
    //定义属性用户名、密码
    private String name;
    private String password;
    
    public User() {
    	
    }
    public User(String name,String password) {
    	this.name = name;
    	this.password = password;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
