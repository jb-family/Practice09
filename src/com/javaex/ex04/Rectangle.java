package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	
	//필드
	private double width;
	private double height;
	
	
	
	//생성자
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//메소드 - gs
	public double getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 - 일반
	public double R(double w, double h) {
		return w * h;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return (width + height) * 2;
	}

	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

	
	
	
	
	
	
	
	
	
	
	
}