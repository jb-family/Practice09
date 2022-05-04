package com.javaex.ex04;

public abstract class Shape {	//추상클래스

	//필드
	private int countSides; //변수의 수
	
	//생성자
	public Shape() {}
	
	
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	//메소드 - gs
	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}
    
	
	//추상메소드
	
	abstract double getArea();	// 넓이
	
	abstract double getPerimeter();	//둘레길이
	
	
	
}