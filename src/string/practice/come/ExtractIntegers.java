/*
 * Q3. Extract the integers 
 Input:
 s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
 3: Rishabh Gupta56"
 Output: 1 2 3 56
 Explanation:
 1, 2, 3, 56 are the integers present in s.
 */

package string.practice.come;

import java.util.Scanner;

public class ExtractIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		String s[]=str.split("\0");
		for(int i=0;i<str.length()-1;i++) 
		{
			if(Character.isDigit(str.charAt(i))) 
			{
				System.out.print(str.charAt(i)+"");
				if(Character.isDigit(str.charAt(i+1))) 
				{
					System.out.print(str.charAt(i+1)+"");
				}
				System.out.print(" ");
			}
		}
	}

}
