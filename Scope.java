
public class Scope {

	//field that is accessible to all methods of this class
	private static int x = 1;
	
	//method main creates and initializes local variablex
	//and calls methods useLocalVariable and useField
	public static void main(String[] args) {
		
		int x = 5;	//main method local variable x shadows field x
		
		System.out.printf("local variable x in main is %d%n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("%nlocal variable x in main is %d%n", x);
		
	}
	
	//create and initialize local variable x in each call
	public static void useLocalVariable()
	{
		int x = 25;		//initialize each time useLocalVariable is called
		
		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", Scope.x);
		
		++x;	//increment this methods local variable x
		
		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
	}
	
	//modify class Scope's field x during each call
	public static void useField()
	{
		System.out.printf("%nfield x on entering method useField is %d%n", x);
		
		x *= 10;	//modifies class Scope's field x
		
		System.out.printf("field x before exiting method useField is %d%n", x);
	}
	
}	//end class Scope
