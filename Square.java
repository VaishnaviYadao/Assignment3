package com.shape;

public class Square implements Polygon1 {
	
	float side;
	public Square(float side)
	{
		super();
		this.side = side;
	}
	@Override
	public void calcArea() {
		float areaS=side*side;
		System.out.println("The area of square:" +areaS);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calcPeri() {
		float periS = 4*side;
		System.out.println("The Perimeter of square:" +periS);
		// TODO Auto-generated method stub
		
	}
	public static void mai(String[] args) {
}

}
