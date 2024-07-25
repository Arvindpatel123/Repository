package starpattern;

import java.util.Scanner;

public class Trangle {

	public static void main(String[] args) {
		
	            Scanner s= new Scanner(System.in);
	             System.out.println("enter the number");
	             int x=s.nextInt();
	                 for(int i=1; i<=x; i++)
	               {
	            	   for(int j=x; j>=i; j--)
	               {
	            	   System.out.print("*");
	               }
	               {
	            	   System.out.println();
	               }
	               

	}

}
}

