package cmput301.typechecking;

public class Employee {
	private int type;
	
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	private int monthlySalary;
	private int commision;
	private int bonus;
	
	public Employee(int aType){
		this.type = aType;
	}

	public int getType(){
		return type;
	}
	
	public void setType(int arg){
		type = arg;
	}
	
	public int payAmount(){
		switch(getType()){
		case ENGINEER:
			return monthlySalary;
		case SALESMAN:
			return monthlySalary + commision;
		case MANAGER:
			return monthlySalary + bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

}
