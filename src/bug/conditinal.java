package bug;

public class conditinal {
        int a=10;
        int b=5;
        int c=1;
        
    public void abc() {
    	if(a>=0) {
    		System.out.println("true");
    	}
    }
   public void xyz() {
	   if(b<=4) {
		   System.out.println("true");
	   }else {
		   System.out.println("false");
	   }
   }	
	public void yogesh() {
		if(b>=a) {
			System.out.println("aa");
			if(c<a) {
				System.out.println("bb");
				if(b<=5) {
					System.out.println("cc");
				}
			}
		}
	}
	public void nikita() {
		if(a<b) {
			System.out.println("xx");
		}
		else if(b<a) {
			System.out.println("yy");
		}
		else if(c<a) {
			System.out.println("zz");
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		conditinal z=new conditinal();
		z.abc();
		z.xyz();
		z.yogesh();
		z.nikita();
	
	}

}
