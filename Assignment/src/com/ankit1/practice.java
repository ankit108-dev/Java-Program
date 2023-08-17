package com.ankit1;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		//Input Taking
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		//Closing the Input
		scan.close();
		greet(name);//Method call

	}
	public static void greet(String Name)
	{ 
		//Printing Result
		System.out.println("Hello Omkar ...How are you ..");
	}

}
