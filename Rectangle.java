package com.shape;

public class Rectangle implements Polygon1{
	
	float length;
	float breadth;
	public  Rectangle(float length, float breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float areaR = length*breadth;
		System.out.println("The area of Rectangle is:" +areaR);
		
	}
	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float periA=2*(length+breadth);
		System.out.println("The perimeter of Rectangle is:" +periA);
		
	}
	public static void main(String[] args)
	{

}
}
