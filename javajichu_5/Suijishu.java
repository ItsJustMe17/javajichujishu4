package javajichu_5;

import java.util.Scanner;

public class Suijishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入最大值：");
		int max=sc.nextInt();
		System.out.println("请输入最小值：");
		int min=sc.nextInt();
		int n=getRand(max,min);
		System.out.println(n);
		
	}
	static int getRand(int max,int min) {
		double d=Math.random();
		int x=(int)(d*1000000);
		x=x%(max-min+1)+min;
		return x;
	}

}
