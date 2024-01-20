public class Manager extends Employee {
	/* Unique Attributes */
	String department = "A";
	
	/* Getter */
	public String getDepartment() {
		return department;
	}
	
	/* Setter */
	public void setDepartment(String department) {
		this.department = department;
	}
	/* Unique Methods */
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + getDepartment());
		
	}
	
}