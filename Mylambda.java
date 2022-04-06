package com.capg.Day8;
interface PosNegative{
	void print(int a);
}
public class Mylambda {
	
public static void main (String [] args) {
		
PosNegative posNegative = (int a) -> {
		if(a > 0) {
			System.out.println("the given num is even " +a);
		}else {
			System.out.println("the given num is odd " +a);
		}
			
		};
		posNegative.print(20);
	}
		
	}
		
