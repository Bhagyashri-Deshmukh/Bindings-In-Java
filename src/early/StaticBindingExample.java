package early;

public class StaticBindingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent1 = new Parent();
		
		//this will call parent class show().
		parent1.show();
		
		System.out.println("==================================================");
		
		// Even this will call parent class show(), as static methods could not be overridden this binding is static.
		Parent parent2 = new Child();
		parent2.show();
	}
	
	// Inner class should always be static
	public static class Parent{
		
		protected static void show() {
			System.out.println("This is a show method from parent class...");
		}
	}
	
	public static class Child extends Parent{
		
		//@Override > adding this annotation will give compile time error because static methods could not be overridden
		protected static void show() {
			System.out.println("This is a show method from child class..........");
		}
	}

}
