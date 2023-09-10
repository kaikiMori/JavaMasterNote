package com.imooc.weekTwo;

import java.util.Scanner;

public class DoubleArrayTest {

	public static void main(String[] args) {
		//定义一个三行两列的整型二维数组intArray
        int[][] intArray = new int[3][2];
        Scanner s = new Scanner(System.in);
       //从键盘输入学生成绩，要求输入顺序与效果图一致
       int sumY = 0;
       int sumS = 0;
       int avgY;
       int avgS;
        for(int i = 0;i <intArray.length; i++){
            for(int j = 0;j < intArray[i].length; j++){
                if(j == 0){
                    System.out.print("请输入第" + (i+1)+"个学生的语文成绩：");
                    intArray[i][j] = s.nextInt();
                    sumY += intArray[i][j];
                }
                else if(j == 1){
                    System.out.print("请输入第" + (i+1)+"个学生的数学成绩：");
                    intArray[i][j] = s.nextInt();
                    sumS += intArray[i][j];
                }
            }
        }

       //求语文的总成绩和平均分
        avgY = sumY / intArray.length;

       //求数学的总成绩和平均分
        avgS = sumS / intArray.length;
        
        System.out.println("语文的总成绩为：" + sumY);
        System.out.println("语文的平均分为：" + avgY);
        System.out.println("数学的总成绩为：" + sumS);
        System.out.println("数学的平均分为：" + avgS);

   }

}
