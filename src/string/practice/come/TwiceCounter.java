package string.practice.come;

import java.util.Scanner;

public class TwiceCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		for(int i=0;i<str.length();i++) {
			int c=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
			}
			if(c==1) {
				System.out.println(c);
				break;
			}
		}
	}

}
