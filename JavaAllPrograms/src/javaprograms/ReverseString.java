package javaprograms;

import java.util.Scanner;

public class ReverseString {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String name=sc.next();//1221

		//String name = "ABCDE";  //rev = EDCBA
		int leng = name.length();//5
		System.out.println(leng);
		String rev="";//ED
		for(int i=leng-1;i>=0;i--) {//i=4,3,2,1,0
			rev=rev+name.charAt(i);//EDCBA
		}
		System.out.println("Reverse of string is::"+rev);
	}
	
}
