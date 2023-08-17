package com.constructorprogram;

public class Camera {
	String brand;
	String color;
	int cost;
	//Constructor  
	public  Camera( String x,String y,int z)
	{
		brand= x;
		color=y;
		cost=z;
	}
	void captureImage()
	{
		System.out.println("Image is capturing");
	}
	void displayImage()
	{
		System.out.println("Image is displaying");
	}

}
