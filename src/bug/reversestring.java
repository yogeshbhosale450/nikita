package bug;

public class reversestring {

	public static void main(String[] args) {
		String name="yogesh";
		int leng=name.length();
		String b="";
		for(int i=leng-1;i>=0;i--) {
			b=b+name.charAt(i);
								
		}
		System.out.println("reverse name: "+b);
	}
}
