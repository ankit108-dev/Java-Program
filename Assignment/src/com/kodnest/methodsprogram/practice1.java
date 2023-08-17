package com.kodnest.methodsprogram;
import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
        System.out.println("Enter name:");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        //greet(name);
        System.out.println("enter birth year:");
        int year =scan.nextInt();
        greet(name);
       int age= Age(year);
       scan.close();
       
       System.out.println("you are 3 years old.");
        

	}
	public static void greet(String name)
	{
		System.out.println("Hello "+name+"..");
	}
	public static int Age(int year)
	{
		return year;
	}

}
