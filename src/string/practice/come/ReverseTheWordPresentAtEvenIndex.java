/*
 * Q4. WAP to reverse the word that are present at even index.
Q5. WAP to reverse the word that are present at odd index.
 */
package string.practice.come;

import java.util.Scanner;

public class ReverseTheWordPresentAtEvenIndex {
	public static void isEven(String str) {
		String s[]=str.split(" ");
		System.out.print("Even: ");
		for(int i=0;i<s.length;i++) {
			if(i%2==0) {
				for(int k=s[i].length()-1;k>=0;k--) {
					System.out.print(s[i].charAt(k)+"");
				}
			}else {
				System.out.print(" "+s[i]+" ");
			}
		}
	}
	public static void isOdd(String str) {
		String s[]=str.split(" ");
		System.out.print("\nOdd: ");
		for(int i=0;i<s.length;i++) {
			if(i%2!=0) {
				for(int k=s[i].length()-1;k>=0;k--) {
					System.out.print(s[i].charAt(k)+"");
				}
			}else {
				System.out.print(" "+s[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		ReverseTheWordPresentAtEvenIndex.isEven(str);
		ReverseTheWordPresentAtEvenIndex.isOdd(str);
	}

}
