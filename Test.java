public class Test {
	public static void main(String[] args) {
		// Instantiate Superclass and Subclass
		Employee Jay = new Employee(); // Superclass
		Manager Bob = new Manager(); // Subclass
		
		Jay.employeeSummary();
		System.out.println();
		Bob.employeeSummary();
		
	}
}