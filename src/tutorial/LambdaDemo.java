package tutorial;

public class LambdaDemo {

	public static void main(String args[]) {
		
		StringTest isIn = (a,b) -> a.indexOf(b) != -1;
		
		String str = "This is a test";
		
		System.out.println("Testing string: " + str);
		
		if(isIn.test(str,"is a"))
			System.out.println("'is a' found");
		else
			System.out.println("'is a' not found");
		
		if(isIn.test(str, "xyz"))
			System.out.println("'xyz' found");
		else
			System.out.println("'xyz' not found");
		
		
	}
}
