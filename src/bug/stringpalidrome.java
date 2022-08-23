package bug;

public class stringpalidrome {

	public static void main(String[] args) {
		
		String a="yogesh";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}if(a.equals(b)) {
			System.out.println("its pallindrome");
		}else {
			System.out.println("its not pallindrome");
		}

	}

}
