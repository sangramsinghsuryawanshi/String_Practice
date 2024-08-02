/*
 * Given a sentence as a string S. Calculate difficulty of a given sentence.
Difficulty of sentence is defined as 5*(number of hard words) + 3*(number of easy words). A
word in the given string is considered hard if it has 4 consecutive consonants or the number of
consonants is more than the number of vowels. Else the word is easy.
Note: uppercase and lowercase characters are the same.
Example
Input:
S = "Difficulty of sentence"
Output:
13
Explanation:
2 hard words + 1 easy word
Example
Input:
S = "I am good"
Output:
9
Explanation:
3 easy word
 */
package string.practice.come;

import java.util.Scanner;

public class DifficultySentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		str=str.toLowerCase();
		String s[] = str.split(" ");
		int a=0,b=0;
		for (int i = 0; i < s.length; i++) {
			int cnt = 1, cntco = 1;
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'a' || s[i].charAt(j) == 'e' || s[i].charAt(j) == 'i' || s[i].charAt(j) == 'o'
						|| s[i].charAt(j) == 'u') 
				{
					cnt++;
				}
				else
				{
					cntco++;
				}
			}
			if(cntco>cnt)
			{
				a++;
			}
			else
			{
				b++;
			}
		}
		System.out.println((5*a)+(3*b));
	}

}
