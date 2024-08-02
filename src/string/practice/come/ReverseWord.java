/*
 * Q16.write a program to reverse the word in string.

i/p : String s="my name is Atul";

o/p : String s= "Atul is name my";
 */
package string.practice.come;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}

}
