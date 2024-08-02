/*
 * Q17. Replace a word
 Example 1:
 Input:
 S ="xxforxx xx for xx"
 oldW = "xx"
 newW ="Geeks"
 Output:
 "geeksforgeeks geeks for geeks"
 Explanation:
 Replacing each "xx" with
 "Geeks" in S.
 Example 2:
 Input:
 S ="india is the xx country"
 oldW = "xx"
 newW ="best"
Output:
 "india is the best country"
 Explanation:
 Replacing each "xx" with
 "best" in S.
 */

package string.practice.come;

import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String sb=sc.nextLine();
		sb=sb.replaceAll("xx", "Geeks");
		System.out.println(sb);
	}

}
