package chapter11;

public class DynamicBindingDemo {
	public static void main(String[] args) {
		Object o = new GraduateStudent();
		m(o);
		
		m(new Student());
		m(new Person());
		m(new Object());
		
	}

	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class GraduateStudent extends Student {
	public String toString() {
		return "GraduateStudent";
	}
}

class Student extends Person {
	public String toString() {
		return "Student";
	}
}

class Person {
	public String toString() {
		return "Person";
	}
}
