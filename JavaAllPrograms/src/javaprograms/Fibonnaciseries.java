package javaprograms;

import java.util.Scanner;

public class Fibonnaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number::");
		int no = sc.nextInt();

		int a=0,b=1,c;
		
		for(int i=0;i<=no-1;i++) { //i=0,1,2,3,4,5
			c=a+b;//8,
			System.out.println(c);//1,2,3,5,8
			
			a=b;//5
			b=c;//8
		}


	}

}
