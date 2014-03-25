package cmput301.typechecking;

public class Client {
	
	public static void main(String args[]){
		Employee emp1 = new Employee(Employee.ENGINEER);	
		emp1.payAmount();
		emp1.setType(Employee.MANAGER);
		emp1.payAmount();
	}
}
