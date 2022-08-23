package bug;

import java.util.Scanner;

public class nopattern {

	public static void main(String[] args) {
		//System.out.println("enter a no");
		//Scanner z=new Scanner(System.in);
		//int a=z.nextInt();
		
		
		for(int i=1;i<=5;i++) {
	      for(int j=4;j>=i;j--) {
	    	  System.out.print("");
	      }		
             for(int k=1;k<=i;k++) {
            	 System.out.print(" "+k);
             }
             System.out.println();
	}
	}
}
