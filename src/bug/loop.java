package bug;

public class loop {
	 int a=10;
	 int b=20;
	  public void fore() {
		  for(int i=b-1;i<=a+5;i++) {
				 if(i%2==0) {
					 System.out.println(i);
				 }
			 } 
	  }
	  void whilee() {
		  		  while(a<=20) {
		  			  if(a%2==0) {
		  				  System.out.println(a);
		  			  }
		  			  a++;
		  		  }
	  }
	  public void doo() {
		do {
			System.out.println(a);
			a=a+2;
		}  while(a<=b);
		  
	  }

	public static void main(String[] args) {
		loop z=new loop();
		//z.fore();
		z.whilee();
		//z.doo();

	}

}
