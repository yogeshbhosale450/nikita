package String;

import java.util.Scanner;

public class primeuser {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		
	for(int i=2;i<=n;i++) {
		int b=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
			b=b+1;
			}
		}if(b==0) {
			System.out.print(i+" ");
		}
	}	
		
		
		

	}
	}

