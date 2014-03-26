package cmput301.typechecking;


/**
 * @see cmput301.typechecking.Employee#ENGINEER
 */
public class Engineer extends Type
{

	public int getType()
	{

		return Employee.ENGINEER;
	}

	public int payAmount(Employee employee)
	{

		return employee.getMonthlySalary();
	}
}