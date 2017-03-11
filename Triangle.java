package com.Triangle;

public class Triangle {
	
	public static String testTriangle(int a ,int b,int c){	
		String result = "";
		if(a + b > c){
			if(a == b&&a == c&&b==c){
				 result = "Equilateral";	
			}
			else if(((a ==b)&&(b!=c))||((a==c)&&(c!=b))||((b==c)&&(a!=b))){
				 result = "Isosceles";	
			}
			else{
				result ="Scalene";
			}
			
		}
		return result;
	}
}
