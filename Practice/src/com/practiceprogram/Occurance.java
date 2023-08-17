//program to count the number of occurrances of a given character in a string
package com.practiceprogram;
import java.util.Scanner;
public class Occurance {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String n=scan.next();
		scan.close();
		
		char ch='i';
		int count=0;
		
		for(int i=0;i<n.length();i++)
		{
			
			if(n.charAt(i)== ch)
			{
			count++;
			}
		
		}
		System.out.println("total occurrance of "+ch+ " is "+count+ " times");
	}
}
		
		
		

	


