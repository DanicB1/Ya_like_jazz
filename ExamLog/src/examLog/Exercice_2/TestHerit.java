package examLog;

public class TestHerit {

	public static void main(String[] args) {
		new Person().sayHello();
		
		Student s = new Student();
		s.setAge(15);
		s.GoToClasses();
		s.sayHello();
		s.DisplayAge();
		
		Teacher t = new Teacher();
		t.setAge(40);
		t.sayHello();
		t.Explain();
		
	}

}
