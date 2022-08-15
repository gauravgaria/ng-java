package basics;

public class PrimitiveDataTypes {
	//primitive data types
	int a=1;
	long l = 230000000;
	float f = 2.98f;
	double h = 2.87;
	boolean value = false;
	
	//Generics 
	String hello="hello";
	Integer inta = 20;
	Boolean bol = false;
	
	public static void main(String[] args) {
		PrimitiveDataTypes dataTypes = new PrimitiveDataTypes();
		System.out.println(dataTypes.a);
		System.out.println(dataTypes.hello.toUpperCase());
		System.out.println(dataTypes.inta.floatValue());
		System.out.println(dataTypes.bol.booleanValue());
		
		//type casting
		float f = (float)dataTypes.a;
		
	}
	
	

}
