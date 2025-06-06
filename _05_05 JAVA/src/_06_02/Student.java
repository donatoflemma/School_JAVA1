package _06_02;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
	private String name;
	private int alter;
	public Student(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", alter=" + alter + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

interface I{
	
}
interface I1 extends I{
	
}
interface I2 extends I{
	
}

interface X extends I1, I2{
	
}
class C implements I{
	
}