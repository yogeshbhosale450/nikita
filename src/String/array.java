package String;

public class array {

	public static void main(String[] args) {
		
		int [] a= {10,56,23,47,'k',56,};
		System.out.println(a[4]);
     for(int b : a) {
    	 if(b==47) {
    		 System.out.println("hieeeeeeeeeeeeeeeeeee");
    	 }else
    		 System.out.println(b);
     }for(int c : a) {
     for(int i=a.length-1;i>=0;i--) {
    	 System.out.println(a[c]+" ");
     }
	}
	}
}
