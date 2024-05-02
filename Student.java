package ch16.Application1;

public class Student{
	 String name;
	 String roll;
	 String section;
	 
	public Student(String name, String roll, String section) {
		super();
		this.name = name;
		this.roll = roll;
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", roll=" + roll + ", section=" + section + "]";
	}

	

}
