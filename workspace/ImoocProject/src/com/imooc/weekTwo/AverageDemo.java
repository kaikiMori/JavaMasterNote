package com.imooc.weekTwo;

public class AverageDemo {
	//求数组元素的平均值
    public float arrAvg(float[] arr){
        float sum = 0;
        for(int i = 0; i <arr.length;i++){
            sum += arr[i];
        }
        float avg = sum / arr.length;
        return avg;
    }
	public static void main(String[] args) {
		//定义对象
		AverageDemo ademo = new AverageDemo();
		//创建float类型的数组并初始化
		float[] floatArr = {78.5f,98.5f,65.5f,32.5f,75.5f};
		//调用方法求平均值并打印输出
		float avg = ademo.arrAvg(floatArr);
		System.out.println("数组的平均值为：" + avg);
	}
	

}
