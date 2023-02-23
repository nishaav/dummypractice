package examples;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a statement : ");
		String inputString=sc.nextLine();
		// olleH dlroW
		
		String arr[]=inputString.split(" ");
//		StringBuffer sb1=new StringBuffer(arr[0]);
//		StringBuffer sb2=new StringBuffer(arr[1]);
//		sb1=sb1.reverse();
//		sb2=sb2.reverse();
		
//		System.out.println(sb1+" "+sb2);

		StringBuffer sbobj=new StringBuffer();
		for(String str:arr)
		{
			StringBuffer sb=new StringBuffer(str);
			sbobj.append(sb.reverse()+" ");
		
		}
		System.out.println(sbobj);
		
		
	}

}
