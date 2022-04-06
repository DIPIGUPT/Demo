package com.capg.Day8;



	 interface StudentDetails {
		 public void student();
	 }
	 
	 interface StudentId {
		 public void id(int g);
	 }
	 
	 interface StudentName {
		 public void name(String kl );
		 
		 
	 }
	 
	 public class LambdaStudent {
		 public static void main(String[] args) {
			 
			 StudentDetails	 a = ()-> System.out.println("welcom to Student info");
			 a.student();
			 
			 StudentId	 b = (int p)-> System.out.println("student id ");
			 b.id(44);
			 
			 StudentName	c = (String kl)-> System.out.println("Student Nmae");
			 c.name("Dipika");
			 
		 }
	 }


