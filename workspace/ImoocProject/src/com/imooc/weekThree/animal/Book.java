package com.imooc.weekThree.animal;

public class Book {
	  //私有属性：书名、作者、出版社、价格
	     private String bookName;
	     private String author;
	     private String publish;
	     private double price;
	  //通过构造方法实现属性赋值
	    public Book(String bookName,String author,String publish,double price){
	        this.bookName = bookName;
	        this.author = author;
	        this.publish = publish;
	        this.setPrice(price);
	    }
	    /*通过公有的get/set方法实现属性的访问，其中：
	    1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
	    2、限定作者、书名均为只读属性
	    */
		public String getPublish() {
			return publish;
		}
		public void setPublish(String publish) {
			this.publish = publish;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			if(price < 10) {
				System.out.println("图书价格必须大于10");
				this.price = 10;
			}else {
				this.price = price;
			}
		}
		//限定书名为只读属性
		public String getBookName() {
			return bookName;
		}
		//限定作者为只读属性
		public String getAuthor() {
			return author;
		}
	    

	  //信息介绍方法，描述图书所有信息
		public void description() {
			System.out.println("书名：" + bookName);
			System.out.println("作者：" + author);
			System.out.println("出版社：" + publish);
			System.out.println("价格：" + price);
		}

	}
