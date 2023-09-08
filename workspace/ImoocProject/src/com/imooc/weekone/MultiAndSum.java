package com.imooc.weekone;

public class MultiAndSum {
    public static void main(String[] args) {
		//定义变量ge、shi、bai，用于存放个位、十位、百位上的数字
        int ge;
        int shi;
        int bai;
		//使用for循环
		for(int i = 200; i <= 300; i++){
			//取出百位数
		    ge = i % 10;
			//取出十位数
			shi = i / 10 % 10;
			//取出个位数
		    bai = i / 100;
			//计算三个数字之积
            int multi = ge * shi * bai;
			//计算三个数字之和
			int sum = ge + shi + bai;
            //如果积等于42并且和为12，则将满足条件的数输出
            if(multi == 42 && sum == 12){
                System.out.println(i);
            }
        }
	}

}
