/*
 * Q13. Easy string (google)
 Example 1:
Input: S = "aaABBb"
 Output: "3a3b"
 Explanation: As 'a' appears 3 times
 consecutively and 'b' also 3 times,
 and 'b' and 'B' considered as same.
 Example 2:
 Input: S = "aaacca"
 Output: "3a2c1a"
 Explanation: As 'a' appears 3 times
 consecutively and 'c' also 2 times,
 and then 'a' 1 time
 */
package string.practice.come;

import java.util.Scanner;

public class EasyString 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.print(ch[i]+""+cnt);
		}
	}
}
