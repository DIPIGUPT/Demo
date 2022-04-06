package com.capg.Day8;


	interface EvenOdd {
		void check(int a);
	}
		public class Mynumberl {
			public static void main(String[] args) {
				EvenOdd evenOdd = (int a) -> {
					if (a % 2 ==0) {
						System.out.println("Even Number:" +a);
					}else {
						System.out.println("Odd Number:" +a);
					}
				};
				evenOdd.check(11);
			}
		

}
