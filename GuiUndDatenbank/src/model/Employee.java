package model;

public class Employee {
	final private String name ;
	final private String lastName;
	final private String id_em;
	private String workType;
	private int vacation;
	private int wage;
	
	public Employee(String name,String lastName,String id_em,String workType,int vacation,int wage) {
		this.name = name;
		this.lastName = lastName;
		this.id_em = id_em;
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

	public String getId_em() {
		return id_em;
	}

	@Override
	public String toString() {
		return "name: " + name +"\n"+
				"last name: " + lastName +"\n"+ 
				"id_em: " + id_em +"\n"+ 
				"workType: " + workType+"\n"+ 
				"vacation: " + vacation +"\n"+ 
				"wage: " + wage;
	}
}
