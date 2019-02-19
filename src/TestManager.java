package threesolid;

class TestManager{
	
	public static void main(String[] args){
		System.out.println("\nWelcome to the New Manager Test!");
	
		// Test ProjectManager
		ProjectManager pjm = new ProjectManager();
		pjm.manage();
		pjm.scheduleWork();

		// Test ProductManager
		ProductManager pdm = new ProductManager();
		pdm.manage();
		pdm.defineProduct();

		// Test Manager
		Manager mgr = new Manager();
		mgr.manage();

		System.out.println();
	}
}