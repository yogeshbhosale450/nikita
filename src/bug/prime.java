package bug;

public class prime {

	public static void main(String[] args) {
		
		
		int c=0;
		int n=13;
		for(int b=2;b<=n-1;b++) {
			if(n%b==0) {
				c=c+1;;
			}
		}if(c==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	
		
		

	}

}
