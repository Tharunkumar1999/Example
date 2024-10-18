package Encapsulation;


/*encapsulation is achieved by declaring the instance variables of a class as private,
 *  Its mainly to make sure hide sensitive details from users
 *  which means they can only be accessed within the class. 
 *  To allow outside access to the instance variables, public methods called getters and setters are defined,*/

public class Encapsulate {
	
	private String name;
	private int age;
	private long rating;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public Long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating=rating;
	}
}

class demo{
	
		public static void main(String[] args) {
			
			Encapsulate en =new Encapsulate();
			
			en.setAge(25);
			en.setName("Tharun");
			en.setRating(5);
			System.out.println(en.getName());
			System.out.println(en.getAge());
			System.out.println(en.getRating());
			
	     }

}
