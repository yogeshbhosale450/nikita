package String;

import java.util.Scanner;

public class scannerstringreverse {

	public static void main(String[] args) {
		 Scanner z=new Scanner(System.in);
		 
		String name=z.next().toString();
		int a=name.length();
		String b="";
		 for(int i=a-1;i>=0;i--) {
			 b=b+name.charAt(i);
		 }
		 System.out.println(b);
	
	}

}
