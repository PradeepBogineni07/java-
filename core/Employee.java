package core;
//Using ObjectReferenceVariable
public class Employee {
	    static String CompanyName = "Tech Solutions";
	    static String Name = "Pradeep";
	    static int EmployeeId = 101;
	    static String Department = "Engineering";
	    static double Salary = 85000.50;
	    public static void main(String[]args) {
	    	Employee obj=new Employee();
	    	System.out.println("CompanyName :"+Employee.CompanyName);
			System.out.println("Name :"+Employee.Name);
			System.out.println("EmployeeId :"+Employee.EmployeeId);
			System.out.println("Department :"+Employee.Department);
			System.out.println("Salary :"+Employee.Salary);
	    }
}
