package string.practice.come;

import java.util.Scanner;

public class ReverseArrayWithoutReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		char[] ch= str.toCharArray();
		int x=ch.length-1;
		for(int i=0;i<=ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[x];
			ch[x]=temp;
			x--;
		}
		str= new String(ch);
		System.out.println("Reverse String-->: "+str);
	}

}
