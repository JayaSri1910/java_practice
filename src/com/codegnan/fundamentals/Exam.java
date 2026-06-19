package com.codegnan.fundamentals;

public class Exam {
	
	    String name;
	    int marks;

	Exam(String name,int marks){
	    this.name=name;
	    this.marks=marks;
	}
	}
	class Main  {
	    public static void main(String[] args) {
	        Exam obj=new Exam("Jaya",80);
	        System.out.println(obj.name);
	        System.out.println(obj.marks);
	    
	}
	}


