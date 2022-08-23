package bug;

public class constructor {
	
	String name;
	int age;
	String surname="bhosale";
	
	public constructor(String name,int age){
		this.name=name;
		this.age=age;
		
		System.out.println(this.name+" : "+this.age+" : "+surname);
	
	}
	
	public static void main(String[] args) {
		constructor z=new constructor("yogesh",26);
		constructor z1=new constructor("nikita",23);
		constructor z2=new constructor("papa",53);
		constructor z3=new constructor("mummy",45);
	}

}
