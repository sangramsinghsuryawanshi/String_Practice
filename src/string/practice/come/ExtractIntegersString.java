/*
 *  Q3. Extract the integers (Zoho)
 Input:
 s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
 3: Rishabh Gupta56"
 Output: 1 2 3 56
 Explanation:
 1, 2, 3, 56 are the integers present in s
 */
package string.practice.come;

import java.util.Scanner;

public class ExtractIntegersString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		for(int i=0;i<str.length()-1;i++) 
		{
			if(Character.isDigit(str.charAt(i+1))==false && Character.isDigit(str.charAt(i)))
			{
				System.out.print(str.charAt(i)+" ");
			}	
			else if(Character.isDigit(str.charAt(i+1)) && Character.isDigit(str.charAt(i)))
			{
				System.out.print(str.charAt(i)+""+str.charAt(i+1)+" ");
				i++;
			}
		}
	}

}
