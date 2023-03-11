package StarPattern;

public class Star2 {
	public static void main(String[] args) {

		for(int i=1;i<=4;i++) //i=3
		    {
			    for(int j=3;j>=i;j--)//i=2
			    {
				   System.out.print(" ");
			    }
			    for(int k=1;k<=i;k++) {//i=2
				System.out.print("*");
			    } 
			  System.out.println(" ");
		    }
	}

}
