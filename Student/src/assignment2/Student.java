package assignment2;

public class Student implements Comparable<Student>{

	int no;
	String name;
	int age;

	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.no=i;
		this.name=string;
		this.age=j;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
}

