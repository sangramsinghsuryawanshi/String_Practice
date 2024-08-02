/*
 * Given a number N, the task is to convert every digit of the number into words.

Examples: 

Input: N = 1234 
Output: One Two Three Four
 */

package string.practice.come;

import java.util.Scanner;

public class PrintOneTwoNumToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
	//	char ch[]= str.toCharArray();
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			switch(i) {
			case 0:System.out.print("one ");
			break;
			case 1:System.out.print("two ");
			break;
			case 2:System.out.print("three ");
			break;
			case 3:System.out.print("four ");
			break;
			default:System.out.println("");
			break;
			}
		}
	}

}
