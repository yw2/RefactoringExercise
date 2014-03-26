package cmput301.typechecking;

public class Employee {
	private Type type = new Engineer();

	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;
	
	private int monthlySalary;
	private int commision;
	private int bonus;
	
	public Employee(int aType){
		this.setType(aType);
	}

	public int getType(){
		return type.getType();
	}
	
	public void setType(int arg){
		switch (arg)
		{
			case ENGINEER:
				this.type = new Engineer();
				break;
			case SALESMAN:
				this.type = new Salesman();
				break;
			case MANAGER:
				this.type = new Manager();
				break;
			default:
				this.type = null;
				break;
		}
	}
	
	public int payAmount(){
		return type.payAmount(this);
	}

	public int getMonthlySalary()
	{

		return monthlySalary;
	}

	public int getCommision()
	{

		return commision;
	}

	public int getBonus()
	{

		return bonus;
	}

}
