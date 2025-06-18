package model;

public class User {
	final private String password;
	final private String name ;
	
	public User(String password, String name ) {
		this.password = password;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", name=" + name + "]";
	}
	
}
