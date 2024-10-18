package Abstraction;


/*Interfaces are used to implement abstraction. 
 * 
 *One class can extend only one class, but can implement multiple interfaces.
 * 
 * To declare an interface, use the interface keyword. 
 * That means all the methods in an interface are declared with an empty body and are public 
 * and all fields are public, static, and final by default. 
 * A class that implements an interface must implement all the methods declared in the interface. 
 * To implement the interface, use the implements keyword.
 * 
 * 
 * 
 * 
 * 
 * */
public interface Interface1 {
	
	int Add(int a, int b);
	int x=10;
	
	default void car() {
		System.out.println("So from java8 we can use defauly method to give impl of metod in Interface");
	}
	
public interface Interface2 {
		
		int Sub(int a, int b);
		
		default void Chuma() {
			System.out.println("So from java8 we can use defauly method to give impl of metod in Interface");
		}
}	
class Maths implements Interface1,Interface2{

	@Override
	public int Add(int a, int b) {
		int c=a+b;
		return c;
	}

	@Override
	public int Sub(int a, int b) {
		int d=a-b;
		return d;
	}
	public static void main(String[] args) {
		Maths m=new Maths();
		
		int x=m.Add(356, 7585);
		System.out.println(x);
		
		m.Chuma();
	}
}

}
