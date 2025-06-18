package model;

public class Employee {
	final private String name ;
	final private String lastName;
	final private int id;
	private String workType;
	private int vacation;
	private int wage;
	
	public Employee(String name,String lastName,int id,String workType,int vacation,int wage) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.workType = workType;
		this.vacation =vacation ;
		this.wage = wage ;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public int getVacation() {
		return vacation;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "EmployeeEditPanel [name=" + name + ", lastName=" + lastName + ", id=" + id + ", workType=" + workType
				+ ", vacation=" + vacation + ", wage=" + wage + "]";
	}
}
