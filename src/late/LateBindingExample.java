package late;

public class LateBindingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent1 = new Parent();
		
		// because the display method is not static, call is resolved at runtime hence Late binding.
		parent1.display();
		
		System.out.println("==================================================");
		
		// late binding.
		Parent parent2 = new Child();
		parent2.display();
	}
	
	public static class Parent{
		
		protected void display() {
			System.out.println("Display method from parent class....");
		}
	}
	
	public static class Child extends Parent{
		
		@Override
		public void display() {
			System.out.println("Display method from child class....");
		}
	}

}
