/*
 * Java Program to swap two string variables without 
 * using third or temp variable.
 */
package string.practice.come;

import java.util.Scanner;

public class PrintTwoStringWithoutSwaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s=new Scanner(System.in);
	       System.out.println("Enter the String:");
	       String str=s.nextLine();
	       System.out.println("Enter the String:");
	       String str1=s.nextLine();
	       int l=str.length();
	       str=str.concat(str1);
	       str1=str.substring(0,l);
	       str=str.substring(l,str.length());
	       System.out.println(str);
	       System.out.println(str1);
	}
}
