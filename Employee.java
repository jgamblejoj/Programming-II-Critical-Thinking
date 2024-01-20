public class Employee {
	/* Attributes */
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	/* Getters */
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	
	/* Setters */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	/* Methods */
	
	// Default Constructor
	public Employee() {
		firstName = "John";
		lastName = "Doe";
		employeeID = 123;
		salary = 0.00;
	}
	// Parameterized Constructor
	public Employee(String firstName, String lastName, int employeeID, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.salary = salary;
	}
	
	// Print account attributes
	public void employeeSummary() {
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last Name: " + getLastName());
		System.out.println("Employee ID: " + getEmployeeID());
	}
	
}