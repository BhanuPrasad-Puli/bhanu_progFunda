package com.gradedproject.q2;
import java.util.*;

public class PowerOfX {
	
	public static long power(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		
		return x*power(x,n-1);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base value:");
		int X = sc.nextInt();
		System.out.println("enter the power value");
		int N = sc.nextInt();
		
		System.out.println(PowerOfX.power(X, N));
		
		
	}
}
