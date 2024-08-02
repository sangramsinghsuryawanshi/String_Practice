package string.practice.come;

import java.util.Scanner;

public class FindMostRepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		String s[]=str.split(" ");
		int max =0;
		String maxele=null;
		for(int i=0;i<s.length;i++) 
		{
			int c=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					c++;
					s[j]=null;
				}
			}
			if(s[i]!=null)
			{
				if(c>max)
				{
					max=c;
					maxele=s[i];
				}
			}
		}
		System.out.println("Most repeated word is: "+max+" "+maxele);
	}

}
