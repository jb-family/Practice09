package com.javaex.ex04;

public class RectTriangle extends Shape {
	
	
	
	//필드
	private int width;
	private int height;
	
	
	//생성자
	public RectTriangle() {
	}
	
	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	//메소드 - gs
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	
	
	//메소드 - 일반

	
	double getArea() {
		return width * (height * 0.5);
	}

	
	double getPerimeter() {
		  double result = width + height + Math.sqrt( width*width + height*height );
	        return result;
	}
	
	
	
	

}