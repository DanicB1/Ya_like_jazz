package examLog;

public class Student extends Person {

	public void GoToClasses() {
		System.out.println("I'm going to class.");
	}
	
	public void DisplayAge() {
		System.out.println("My age is: "+ super.age +" years old");
	}
}
