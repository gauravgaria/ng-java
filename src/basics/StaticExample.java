package basics;

public class StaticExample {

	//members in class
	String stringMember = "helo";		// member 1
	
	public void stringMember() {		// member 2
		
	}
	
	public StaticExample(String name) {		// member 3
		
	}
	
	static {							// member 4		-> static block : called before main method
		
	}
	
	{									// member 5 -> non static block: called before constructor but after main method
		
	}
	
	public StaticExample() {
		// TODO Auto-generated constructor stub
		System.out.println("I am a constructor");
	}
	
	static {
		System.out.println("I am static block");
	}
	
	{
		System.out.println("I am non static block");	
	}
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main method");
	
		 StaticExample.showStaticBlock().methodName("asd","dasd");
		new StaticExample().methodName("asda", "askjdnakjsd");
		
		//methodName("asd","dasd");
	}
	 
	 public static StaticExample showStaticBlock() {
		 return new StaticExample();
	 }
	 
	 public void methodName(String username, String password) {
		methodName1("asd", "asdda"); 
	 }
	 
	 public void methodName1(String username, String password) {
		 
	 }
	 
	 
}
